package com.pingwit_java_course.part11.homework.task1;

public class CheckoutMain {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Vehicle("1752GF", VehicleType.CARGO, 12, 4146.54),
                new Vehicle("6542HD", VehicleType.PASSENGERS, 1, 1245.87),
                new Vehicle("7218TK", VehicleType.PASSENGERS, 3, 1367.12),
                new Vehicle("0685QB", VehicleType.CARGO, 8, 3189.38),
                new Vehicle("5321YR", VehicleType.CARGO, 17, 3465.91)
        };
        FerryCheckout checkout = new FerryCheckout();
        checkout.processVehicles(vehicles);

        FerryAdmission admission = new FerryAdmission();
        admission.isFerryAllowed(vehicles);

        if (admission.isFerryAllowed(vehicles)) {
            System.out.println("Ferry is allowed to go.");
        } else {
            System.out.println("Ferry is NOT allowed to go.");
        }
    }
}