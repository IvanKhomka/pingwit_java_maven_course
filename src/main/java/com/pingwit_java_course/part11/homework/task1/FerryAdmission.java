package com.pingwit_java_course.part11.homework.task1;

public class FerryAdmission {
    private static final int MAX_ALLOWED_PEOPLE = 50;
    private static final int MAX_ALLOWED_WEIGHT = 15000;

    public boolean isFerryAllowed(Vehicle[] vehicles) {
        int totalPeople = 0;
        double totalWeight = 0;

        for (Vehicle vehicle : vehicles) {
            totalPeople += vehicle.getPeopleOnBoard();
            totalWeight += vehicle.getWeight();
        }

        return totalPeople <= MAX_ALLOWED_PEOPLE && totalWeight < MAX_ALLOWED_WEIGHT;
    }
}