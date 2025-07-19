package com.pingwit_java_course.part12.homework.task3;

public class Flat {
    private void openDoor() {
        System.out.println("Door opened without passcode.");
    }

    private void openDoor(String passcode) {
        System.out.println("Door opened with passcode: " + passcode);
    }
}