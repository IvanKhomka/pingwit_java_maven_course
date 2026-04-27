package com.pingwit_java_course.part41.homework.task2;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StockDataFiller {

    private static final String URL = "jdbc:postgresql://localhost:5432/pingwit_db";
    private static final String USER = "postgres";
    private static final String PASSWORD = "docker";

    public static void main(String[] args) {

        String insertSQL = "INSERT INTO stocks (ticker, company_name, location, last_price) VALUES (?, ?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {

            preparedStatement.setString(1, "NKE");
            preparedStatement.setString(2, "Nike Inc.");
            preparedStatement.setString(3, "Beaverton, USA");
            preparedStatement.setBigDecimal(4, new BigDecimal("102.45"));
            preparedStatement.executeUpdate(); // -> preparedStatement.addBatch();

            preparedStatement.setString(1, "COLM");
            preparedStatement.setString(2, "Columbia Sportswear.");
            preparedStatement.setString(3, "Portland, USA");
            preparedStatement.setBigDecimal(4, new BigDecimal("78.30"));
            preparedStatement.executeUpdate();// -> preparedStatement.addBatch();

            preparedStatement.setString(1, "ADS");
            preparedStatement.setString(2, "Adidas AG.");
            preparedStatement.setString(3, "Herzogenaurach, Germany");
            preparedStatement.setBigDecimal(4, new BigDecimal("195.20"));
            preparedStatement.executeUpdate();// -> preparedStatement.addBatch();

            //и вот здесь
            //preparedStatement.executeBatch(); // один запрос к БД

            System.out.println("Data successfully inserted into 'stocks' table");

        } catch (SQLException e) {
            System.err.println("Error inserting data:");
            e.printStackTrace();
        }
    }
}