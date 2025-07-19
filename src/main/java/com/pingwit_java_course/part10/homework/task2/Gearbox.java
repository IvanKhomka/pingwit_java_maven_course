package com.pingwit_java_course.part10.homework.task2;

public class Gearbox {
    private static final int MIN_GEAR = 0;
    private static final int MAX_GEAR = 7;

    private int currentGear;

    public void shiftUp() {
        if (currentGear < MAX_GEAR) {
            currentGear++;
            System.out.println("Gear up: " + currentGear);
        } else {
            System.out.println("The maximum gear is already engaged.");
        }
    }

    public void shiftDown() {
        if (currentGear > MIN_GEAR) {
            currentGear--;
            System.out.println("Gear down: " + currentGear);
        } else {
            System.out.println("The gearbox is already in neutral.");
        }
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setGear(int gear) {
        if (gear >= MIN_GEAR && gear <= MAX_GEAR) {
            currentGear = gear;
            System.out.println("Gear is set to " + gear);
        }
    }
}