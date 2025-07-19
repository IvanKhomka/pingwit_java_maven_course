package com.pingwit_java_course.part10.homework.task1;

public class Desktop implements Computer {

    @Override
    public void turnOn() {
        System.out.println("Desktop is turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("Desktop is turning off");
    }

    @Override
    public void reset() {
        System.out.println("Desktop is in reset");
    }
}