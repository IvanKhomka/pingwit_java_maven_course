package com.pingwit_java_course.part10.homework.task2;

public class CarMain {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.drive();

        myCar.startEngine();

        myCar.startEngine();

        myCar.drive();

        myCar.shiftGearUp();

        myCar.drive();

        myCar.shiftGearUp();
        myCar.drive();

        myCar.stopEngine();

        myCar.drive();
    }
}

