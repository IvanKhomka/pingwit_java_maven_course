package com.pingwit_java_course.part33.homework.task2;

public class DailyWeather {
    private String date;
    private Temperature temperature;
    private String description;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAverageTemperature() { // этот метод лучше вынести в WeatherPlanner и сделать его приватным
        return (temperature.getMorning() + temperature.getDay()
                + temperature.getEvening() + temperature.getNight()) / 4.0;
    }
}