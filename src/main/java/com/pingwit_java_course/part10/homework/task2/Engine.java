package com.pingwit_java_course.part10.homework.task2;

public class Engine {
    private boolean isRunning;

    public void start() {
        if (isRunning) {
            System.out.println("The engine is already running.");
        } else {
            isRunning = true;
            System.out.println("The engine is running.");
        }
    }

    public void stop() {
        if (!isRunning) {
            System.out.println("The engine is already turned off.");
        } else {
            isRunning = false;
            System.out.println("The engine is turned off.");
        }
    }

    public boolean isRunning() {
        return isRunning;
    }
}

