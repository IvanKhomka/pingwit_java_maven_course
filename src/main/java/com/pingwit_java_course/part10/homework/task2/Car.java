package com.pingwit_java_course.part10.homework.task2;

public class Car {
    private Engine engine;
    private Gearbox gearbox;

    public Car() {
        engine = new Engine();
        gearbox = new Gearbox();
    }

    public void startEngine() {
        engine.start();
    }

    public void stopEngine() {
        engine.stop();
    }

    public void shiftGearUp() {
        gearbox.shiftUp();
    }

    public void shiftGearDown() {
        gearbox.shiftDown();
    }

    public void drive() {
        if (!engine.isRunning()) {
            System.out.println("It is impossible to drive. The engine is not running.");
            return;
        }

        int gear = gearbox.getCurrentGear();
        if (gear == 0) {
            System.out.println("Unable to drive. Put the car in gear.");
            return;
        }

        int speed = gear * 20;
        System.out.println("The car is moving. Current speed: " + speed + " km/h");
    }
}

