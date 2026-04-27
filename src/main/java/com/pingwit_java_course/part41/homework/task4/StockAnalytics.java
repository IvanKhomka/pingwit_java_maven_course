package com.pingwit_java_course.part41.homework.task4;

import com.pingwit_java_course.part41.homework.task3.Stock;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StockAnalytics {
    private static final String URL = "jdbc:postgresql://localhost:5432/pingwit_db";
    private static final String USER = "postgres";
    private static final String PASSWORD = "docker";

    public static void main(String[] args) {
        int x = 3;
        List<Stock> topStocks = getTopExpensiveStocks(x, x);//понимаю желание сократить, но лучше так не делать

        System.out.println("Top-" + x + " most expensive stocks for " + x + " day/days:");
        topStocks.forEach(System.out::println);
    }

    public static List<Stock> getTopExpensiveStocks(int topX, int daysLimit) {
        List<Stock> resultList = new ArrayList<>();

        String sql = "SELECT * FROM stocks " +
                "WHERE update_date_time >= CURRENT_TIMESTAMP - (INTERVAL '1 day' * ?) " +
                "ORDER BY last_price DESC " +
                "LIMIT ?";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, daysLimit);
            pstmt.setInt(2, topX);

            // ResultSet в try-with-resources
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                resultList.add(new Stock(
                        rs.getInt("id"),
                        rs.getString("ticker"),
                        rs.getString("company_name"),
                        rs.getString("location"),
                        rs.getBigDecimal("last_price"),
                        rs.getTimestamp("update_date_time").toLocalDateTime()
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultList;
    }
}