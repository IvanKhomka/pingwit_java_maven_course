package com.pingwit_java_course.part11.homework.task1;

public class FerryCheckout {
    private static final int CARGO_PRICE = 30;
    private static final int PASSENGER_VEHICLE_PRICE_UNDER_3 = 10;
    private static final int PASSENGER_VEHICLE_PRICE_OVER_2 = 15;
    private static final int PASSENGERS_IN_VEHICLE_LIMIT = 2;


    public void processVehicles(Vehicle[] vehicles) {
        int totalPrice = 0;
        int totalPeople = 0;

        for (Vehicle vehicle : vehicles) {
            int price = 0;
            if (vehicle.getVehicleType() == VehicleType.CARGO) {
                price = CARGO_PRICE;
            } else if (vehicle.getVehicleType() == VehicleType.PASSENGERS && vehicle.getPeopleOnBoard() <= PASSENGERS_IN_VEHICLE_LIMIT) {
                price = PASSENGER_VEHICLE_PRICE_UNDER_3;
            } else if (vehicle.getVehicleType() == VehicleType.PASSENGERS && vehicle.getPeopleOnBoard() > PASSENGERS_IN_VEHICLE_LIMIT) {
                price = PASSENGER_VEHICLE_PRICE_OVER_2;
            }
            totalPrice += price;
            totalPeople += vehicle.getPeopleOnBoard();
            System.out.println("Vehicle " + vehicle.getLicensePlate() + " pays: " + price + " euros with " + vehicle.getPeopleOnBoard() + " passengers.");
        }

        System.out.println("Total payment: " + totalPrice + " euros.");
        System.out.println("Total passengers on board: " + totalPeople);
    }
}