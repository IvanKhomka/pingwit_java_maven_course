package com.pingwit_java_course.part25.homework.task4and5;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupCarsByManufacturer {
    public static void main(String[] args) {
        List<Car> cars = List.of(
                new Car("Model S", "Tesla", true),
                new Car("Model 3", "Tesla", true),
                new Car("Civic", "Honda", false),
                new Car("Accord", "Honda", false),
                new Car("Corolla", "Toyota", false)
        );

        Map<String, List<Car>> grouped = cars.stream()
                .collect(Collectors.groupingBy(Car::getManufacturer));

        System.out.println("Cars grouped by manufacturer:");
        grouped.forEach((manufacturer, groupedCars) -> { // cars уже есть, поэтому выбрал такое название
            System.out.println("Manufacturer: " + manufacturer);
            groupedCars.forEach(car -> System.out.println("  " + car.getModel()));
        });
    }
}