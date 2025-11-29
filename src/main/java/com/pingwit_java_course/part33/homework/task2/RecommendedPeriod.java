package com.pingwit_java_course.part33.homework.task2;

public class RecommendedPeriod {
    private final int startIndex; //startIndex -> startDay и возможно стоит поле сделать Integer и хранить null если не найдено вместо -1
    private final int length;
    private final double averageTemp;

    public RecommendedPeriod(int startIndex, int length, double averageTemp) {
        this.startIndex = startIndex;
        this.length = length;
        this.averageTemp = averageTemp;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public int getLength() {
        return length;
    }

    public double getAverageTemp() {
        return averageTemp;
    }

    public boolean isFound() {
        return startIndex >= 0;
    }
}