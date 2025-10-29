package com.pingwit_java_course.part33.homework.task2;

import java.util.List;

public class WeatherPlanner {
    private final Forecast forecast;

    public WeatherPlanner(Forecast forecast) {
        this.forecast = forecast;
    }

    public void findBestPeriod(double targetTemp, int desiredDays) {
        List<DailyWeather> days = forecast.getForecast();
        int totalDays = days.size();

        double bestAvg = 0;
        int bestStart = -1;
        int bestLength = 0;


        // как можно улучшить алгоритм, если существует несколько подходящих периодов с одинаковой средней температурой?
        //как думаешь, стоит 1 раз пройтись по List<DailyWeather> и посчитать средние температуры, чтобы не делать это каждый раз в цикле?
        for (int start = 0; start < totalDays; start++) {
            double sum = 0;
            int count = 0;
            for (int end = start; end < totalDays; end++) {
                sum += days.get(end).getAverageTemperature();
                count++;
                double avg = sum / count;

                if (avg >= targetTemp && count <= desiredDays && avg > bestAvg) {
                    bestAvg = avg;
                    bestStart = start;
                    bestLength = count;
                }
            }
        }

        System.out.println("\nCity: " + forecast.getCity());
        if (bestStart >= 0) {
            System.out.printf("Recommended period: %s — %s (%d days)%n",
                    days.get(bestStart).getDate(),
                    days.get(bestStart + bestLength - 1).getDate(),
                    bestLength);
            System.out.printf("Average temperature: %.2f°C%n", bestAvg);
        } else {
            System.out.printf("No suitable period found with average temperature above %.1f°C.%n", targetTemp);
        }
    }
}