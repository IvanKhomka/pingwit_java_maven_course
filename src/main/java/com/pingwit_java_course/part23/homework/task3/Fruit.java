package com.pingwit_java_course.part23.homework.task3;

public class Fruit {
    private String name;
    private double weight;
    private String type;

    public Fruit(String name, double weight, String type) {
        this.name = name;
        this.weight = weight;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return name + " (" + weight + " kg)";
    }
}