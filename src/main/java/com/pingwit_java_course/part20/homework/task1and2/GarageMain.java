package com.pingwit_java_course.part20.homework.task1and2;

public class GarageMain {
    public static void main(String[] args) {
        Garage<Tesla> teslaGarage = new Garage<>();
        teslaGarage.park(new Tesla("Tesla Model 3", "black"));
        teslaGarage.park(new Tesla("Tesla Model Y", "white"));

        Garage<BMW> bmwGarage = new Garage<>();
        bmwGarage.park(new BMW("BMW 323", "dark blue"));
        bmwGarage.park(new BMW("BMW X5 M", "silver"));

        Garage<Car> carGarage = new Garage<>();
        carGarage.park(new Tesla("Tesla Cybertruck", "silver"));
        carGarage.park(new BMW("BMW M3 comp", "Black"));

        System.out.println("BMW Garage: " + bmwGarage.getCars());
        System.out.println("Tesla Garage: " + teslaGarage.getCars());
        System.out.println("Car Garage: " + carGarage.getCars());
        System.out.println("Черных BMW в гараже: " + bmwGarage.countCars("black"));
        System.out.println("Черных Tesla в гараже: " + teslaGarage.countCars("black"));
        System.out.println("Черных авто в общем гараже: " + carGarage.countCars("Black"));
    }
}