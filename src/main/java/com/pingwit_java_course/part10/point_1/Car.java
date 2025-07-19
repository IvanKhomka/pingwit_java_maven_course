package com.pingwit_java_course.part10.point_1;

public interface Car {
    int MAX_SPEED = 355;

    void move();
    String getProducer();
    default void openDoor(){
        System.out.println("Door is open");
    }

    static String showInterface(){
        return "I'm a car";
    }
}
