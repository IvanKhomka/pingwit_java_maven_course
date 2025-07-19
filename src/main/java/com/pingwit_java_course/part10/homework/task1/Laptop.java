package com.pingwit_java_course.part10.homework.task1;

public class Laptop implements Computer {

    @Override
    public void turnOn() {
        System.out.println("Laptop is turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("Laptop is turning off");
    }

    @Override
    public void reset() {
        System.out.println("Laptop is in reset");
    }
}
