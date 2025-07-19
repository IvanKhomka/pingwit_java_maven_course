package com.pingwit_java_course.part10.point_1;

public class Tesla implements Car, ElectricEngine  {
    @Override
    public void move() {

    }

    @Override
    public String getProducer() {
        return "";
    }

    @Override
    public void openDoor() {
        System.out.println("Tesla's door is opened");
    }
}
