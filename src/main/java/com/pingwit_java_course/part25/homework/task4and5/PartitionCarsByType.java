package com.pingwit_java_course.part25.homework.task4and5;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionCarsByType {
    public static void main(String[] args) {
        List<Car> cars = List.of(
                new Car("Model S", "Tesla", true),
                new Car("Model 3", "Tesla", true),
                new Car("Civic", "Honda", false),
                new Car("Accord", "Honda", false),
                new Car("Leaf", "Nissan", true),
                new Car("Skyline", "Nissan", false)
        );

        Map<Boolean, List<Car>> partitioned = cars.stream()
                .collect(Collectors.partitioningBy(Car::isElectric));

        List<Car> electricCars = partitioned.get(true);
        List<Car> otherCars = partitioned.get(false);

        System.out.println("Electric cars:");
        electricCars.forEach(car -> System.out.println("  " + car.getModel() + " (" + car.getManufacturer() + ")"));

        System.out.println("Other cars:");
        otherCars.forEach(car -> System.out.println("  " + car.getModel() + " (" + car.getManufacturer() + ")"));
    }
}