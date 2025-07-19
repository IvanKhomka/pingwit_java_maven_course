package com.pingwit_java_course.part20.homework.task1and2;

import java.util.ArrayList;
import java.util.List;

public class Garage<T extends Car> {
    private final List<T> cars = new ArrayList<>();

    public void park(T car) {
        cars.add(car);
        System.out.println(car.getModel() + " parked!");
    }

    public List<T> getCars() {
        return cars;
    }

    public int countCars(String color) {
        int count = 0;
        for (T car : cars) {
            if (car.getColor().equalsIgnoreCase(color)) {
                count++;
            }
        }
        return count;
    }
}