package com.pingwit_java_course.part33.homework.task2;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class VacationPlannerMain {

    private static final String FORECAST_FILE = "src/main/resources/part33/homework/task2/forecast.json";
    private static final double DEFAULT_TARGET_TEMP = 20.0;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter desired average temperature (press Enter for default temperature(20°C)): ");
            String tempInput = scanner.nextLine();
            double targetTemp = tempInput.isEmpty() ? DEFAULT_TARGET_TEMP : Double.parseDouble(tempInput);

            System.out.print("Enter desired vacation length (in days): ");
            int desiredDays = scanner.nextInt();

            String json = new String(Files.readAllBytes(Paths.get(FORECAST_FILE)));
            ObjectMapper mapper = new ObjectMapper();
            Forecast forecast = mapper.readValue(json, Forecast.class);

            WeatherPlanner planner = new WeatherPlanner(forecast);
            planner.findBestPeriod(targetTemp, desiredDays);

        } catch (IOException e) {
            System.err.println("Error reading forecast file: " + e.getMessage());
        }
    }
}