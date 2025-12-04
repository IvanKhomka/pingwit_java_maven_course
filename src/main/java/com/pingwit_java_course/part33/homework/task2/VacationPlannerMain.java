package com.pingwit_java_course.part33.homework.task2;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class VacationPlannerMain {

    private static final String FORECAST_FILE = "src/main/resources/part33/homework/task2/forecast.json";
    private static final double DEFAULT_TARGET_TEMP = 20.0;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            ObjectMapper mapper = new ObjectMapper();

            Forecast forecast = mapper.readValue(new File(FORECAST_FILE), Forecast.class);

            System.out.print("Enter desired average temperature (press Enter for default 20°C): ");
            String tempInput = scanner.nextLine();
            double targetTemp = tempInput.isEmpty() ? DEFAULT_TARGET_TEMP : Double.parseDouble(tempInput);

            System.out.print("Enter desired vacation length (in days): ");
            int desiredDays = scanner.nextInt();

            WeatherPlanner planner = new WeatherPlanner(forecast);
            RecommendedPeriod period = planner.findBestPeriod(targetTemp, desiredDays);

            System.out.println("\nCity: " + forecast.getCity());

            if (period.isFound()) {
                DailyWeather start = forecast.getForecast().get(period.getStartDay());
                DailyWeather end = forecast.getForecast().get(period.getStartDay() + period.getLength() - 1);

                System.out.printf("Recommended period: %s — %s (%d days)%n",
                        start.getDate(), end.getDate(), period.getLength());
                System.out.printf("Average temperature: %.2f°C%n", period.getAverageTemp());
            } else {
                System.out.printf("No suitable period found with average temperature above %.1f°C.%n", targetTemp);
            }

        } catch (IOException e) {
            System.err.println("Error reading forecast file: " + e.getMessage());
        }
    }
}