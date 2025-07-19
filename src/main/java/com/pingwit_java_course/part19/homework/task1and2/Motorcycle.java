package com.pingwit_java_course.part19.homework.task1and2;

import java.io.Serializable;

public class Motorcycle implements Serializable {
    private static final long serialVersionUID = 1L;

    private String brand;
    private String model;
    private Engine engine;

    public Motorcycle(String brand, String model, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }
}