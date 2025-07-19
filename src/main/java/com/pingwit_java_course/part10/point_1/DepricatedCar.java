package com.pingwit_java_course.part10.point_1;

public interface DepricatedCar {
    default void openDoor(){
        System.out.println("Door is opened");
    }
}
