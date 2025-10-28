package com.pingwit_java_course.part33.homework.task2;

import java.util.List;

public class Forecast {
    private String city;
    private List<DailyWeather> forecast;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<DailyWeather> getForecast() {
        return forecast;
    }

    public void setForecast(List<DailyWeather> forecast) {
        this.forecast = forecast;
    }
}