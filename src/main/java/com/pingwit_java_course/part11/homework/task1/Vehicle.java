package com.pingwit_java_course.part11.homework.task1;

public class Vehicle {

    private String licensePlate;
    private VehicleType vehicleType;
    private int peopleOnBoard;
    private double weight;

    public Vehicle(String licensePlate, VehicleType vehicleType, int peopleOnBoard, double weight) {
        this.licensePlate = licensePlate;
        this.vehicleType = vehicleType;
        this.peopleOnBoard = peopleOnBoard;
        this.weight = weight;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public int getPeopleOnBoard() {
        return peopleOnBoard;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "licensePlate='" + licensePlate + '\'' +
                ", vehicleType=" + vehicleType +
                ", peopleOnBoard=" + peopleOnBoard +
                ", weight=" + weight +
                '}';
    }
}
