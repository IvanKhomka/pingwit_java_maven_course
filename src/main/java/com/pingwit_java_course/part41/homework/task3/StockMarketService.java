package com.pingwit_java_course.part41.homework.task3;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StockMarketService {

    private static final String URL = "jdbc:postgresql://localhost:5432/pingwit_db";
    private static final String USER = "postgres";
    private static final String PASSWORD = "docker";

    public static void main(String[] args) {
        int page = 1;
        int size = 5;

        List<Stock> stocks = getStocksByPage(page, size);

        System.out.println("Page " + page + ":");
        stocks.forEach(System.out::println);
    }

    public static List<Stock> getStocksByPage(int pageNumber, int pageSize) {
        List<Stock> stockList = new ArrayList<>();
        int offset = (pageNumber - 1) * pageSize;

        String sql = "SELECT * FROM stocks ORDER BY id LIMIT ? OFFSET ?";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, pageSize);
            pstmt.setInt(2, offset);

            //чтобы совсем красиво было
            /*
            try (ResultSet rs = pstmt.executeQuery()) {} -> result set тоже хорошо в try-with-resources добавлять
            * */
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                stockList.add(mapResultSetToStock(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return stockList;
    }

    private static Stock mapResultSetToStock(ResultSet rs) throws SQLException {
        return new Stock(
                rs.getInt("id"),
                rs.getString("ticker"),
                rs.getString("company_name"),
                rs.getString("location"),
                rs.getBigDecimal("last_price"),
                rs.getTimestamp("update_date_time").toLocalDateTime()
        );
    }
}