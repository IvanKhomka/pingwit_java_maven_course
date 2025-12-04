package com.pingwit_java_course.part33.homework.task2;

public class RecommendedPeriod {

    private final Integer startDay;
    private final int length;
    private final double averageTemp;

    public RecommendedPeriod(Integer startDay, int length, double averageTemp) {
        this.startDay = startDay;
        this.length = length;
        this.averageTemp = averageTemp;
    }

    public Integer getStartDay() {
        return startDay;
    }

    public int getLength() {
        return length;
    }

    public double getAverageTemp() {
        return averageTemp;
    }

    public boolean isFound() {
        return startDay != null;
    }
}