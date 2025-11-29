package com.pingwit_java_course.part33.homework.task2;

import java.util.List;

public class WeatherPlanner {
    private final Forecast forecast;

    public WeatherPlanner(Forecast forecast) {
        this.forecast = forecast;
    }

    private double avg(DailyWeather day) { //приватные методы лучше размещать внизу класса
        Temperature t = day.getTemperature();

        // твой вариант будет работать быстрее, но если появятся новые поля в Temperature, то 4.0 необходимо будет менять на 5.0 и т.д.
        /* альтернативный вариант:
         List.of(1.0, 2.0, 3.0).stream()
                .mapToDouble(Double::doubleValue)
                .average();
         */
        return (t.getMorning() + t.getDay() + t.getEvening() + t.getNight()) / 4.0;
    }

    public RecommendedPeriod findBestPeriod(double targetTemp, int desiredDays) {

        List<DailyWeather> days = forecast.getForecast();
        int totalDays = days.size();

        double[] avgTemps = new double[totalDays];
        for (int i = 0; i < totalDays; i++) {
            avgTemps[i] = avg(days.get(i));
        }

        double bestAvg = 0;
        int bestStart = -1;
        int bestLength = 0;

        for (int start = 0; start < totalDays; start++) {
            double sum = 0;
            for (int end = start; end < totalDays; end++) {

                int count = end - start + 1;

                if (count > desiredDays) break; //всегда используй фигурные скобки для блоков if, for, while

                sum += avgTemps[end];
                double avg = sum / count;

                if (avg >= targetTemp) {
                    if (avg > bestAvg || (avg == bestAvg && count > bestLength)) {
                        bestAvg = avg;
                        bestStart = start;
                        bestLength = count;
                    }
                }
            }
        }

        return new RecommendedPeriod(bestStart, bestLength, bestAvg);
    }
}