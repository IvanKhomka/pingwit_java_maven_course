package com.pingwit_java_course.part24.homework.task4;

public class Product {
    private int id;
    private String name;
    private double price;
    private boolean available;

    public Product(int id, String name, double price, boolean available) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.available = available;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return id + ". " + name + " - " + price + " руб.";
    }
}