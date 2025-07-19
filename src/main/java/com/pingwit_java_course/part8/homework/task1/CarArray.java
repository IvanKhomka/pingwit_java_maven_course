package com.pingwit_java_course.part8.homework.task1;

public class CarArray {
    public static void main(String[] args) {
        Car[] cars = {
                new Car("Audi", "RS6", 4),
                new Car(null, "C4", 3),
                new Car("BMW", "M4", 4),
                new Car("Mercedes", "Amg GT", 2),
                new Car("Audi", "Q7", 4),
        };

        String carPredicate = "Audi";

        for (Car car : cars) {
            if (carPredicate.equals(car.getProducer())) {
                System.out.println(car);
                car.openDoors();
            }
        }
    }
}
