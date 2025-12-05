package com.pingwit_java_course.part33.homework.task2;

import java.util.List;

public class WeatherPlanner {
    private final Forecast forecast;

    public WeatherPlanner(Forecast forecast) {
        this.forecast = forecast;
    }

    public RecommendedPeriod findBestPeriod(double targetTemp, int desiredDays) {

        List<DailyWeather> days = forecast.getForecast();
        int totalDays = days.size();

        double[] avgTemps = new double[totalDays];
        for (int i = 0; i < totalDays; i++) {
            avgTemps[i] = avg(days.get(i));
        }

        double bestAvg = 0;
        Integer bestStart = null;
        int bestLength = 0;

        for (int start = 0; start < totalDays; start++) {
            double sum = 0;
            for (int end = start; end < totalDays; end++) {

                int count = end - start + 1;

                if (count > desiredDays) {
                    break;
                }

                sum += avgTemps[end];
                double avg = sum / count;

                if (avg >= targetTemp) {
                    if (bestStart == null || avg > bestAvg || (avg == bestAvg && count > bestLength)) {
                        bestAvg = avg;
                        bestStart = start;
                        bestLength = count;
                    }
                }
            }
        }

        return new RecommendedPeriod(bestStart, bestLength, bestAvg);
    }

    private double avg(DailyWeather day) {
        Temperature t = day.getTemperature();
        /// вишенкой на торте можно заменить List.of на Stream.of
        return List.of(
                        t.getMorning(),
                        t.getDay(),
                        t.getEvening(),
                        t.getNight()
                )
                .stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(Double.NaN);
    }
}