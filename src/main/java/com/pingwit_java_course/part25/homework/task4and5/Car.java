package com.pingwit_java_course.part25.homework.task4and5;

public class Car {
    private String model;
    private String manufacturer;
    private boolean electric;

    public Car(String model, String manufacturer, boolean electric) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.electric = electric;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public boolean isElectric() {
        return electric;
    }
}