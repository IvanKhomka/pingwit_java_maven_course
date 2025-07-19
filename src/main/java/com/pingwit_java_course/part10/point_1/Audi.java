package com.pingwit_java_course.part10.point_1;

public class Audi implements Car, DepricatedCar, Engine {
    private static final String PRODUCER = "Audi";

    private int getCurrentTransmission = 0;

    @Override
    public void move() {
        System.out.println("Audi is moving");
    }

    @Override
    public String getProducer() {
        return PRODUCER;
    }

    @Override
    public void openDoor() {
        Car.super.openDoor();
    }

    public int getCurrentTransmission() {
        return getCurrentTransmission;
    }

}
