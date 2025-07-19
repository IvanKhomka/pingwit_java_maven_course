package com.pingwit_java_course.part4.homework.task1;

public class TrainingResult {
    public static void main(String[] args) {

        double dailyDistance = 10.0;
        double totalDistance = dailyDistance;

        System.out.println("Your distance at 1 day " + totalDistance + " km");

        for (int daysOfTraining = 2; daysOfTraining <= 7; daysOfTraining++) {
            dailyDistance = dailyDistance * 0.1 + dailyDistance;
            totalDistance += dailyDistance;
            System.out.println("Your distance at " + daysOfTraining + " day " + totalDistance + " km");
        }
        System.out.println("Your total weekly distance " + totalDistance + " km");
    }
}
