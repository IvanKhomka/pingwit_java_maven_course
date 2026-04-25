package com.pingwit_java_course.part41.homework.task1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StocksTableCreator {

    private static final String URL = "jdbc:postgresql://localhost:5432/pingwit_db";
    private static final String USER = "postgres";
    private static final String PASSWORD = "docker";

    public static void main(String[] args) {
        String createTableSQL = "CREATE TABLE stocks (" +
                "id SERIAL PRIMARY KEY, " +
                "ticker VARCHAR(5) NOT NULL, " +
                "company_name VARCHAR(255) NOT NULL, " +
                "location VARCHAR(255), " +
                "last_price DECIMAL(15, 2), " +
                "update_date_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP" +
                ");";


        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement()) {


            statement.execute(createTableSQL);
            System.out.println("Table 'stocks' was successfully created!");

        } catch (SQLException e) {
            System.err.println("Error while working with database:");
            e.printStackTrace();
        }
    }
}