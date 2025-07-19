package com.pingwit_java_course.part8.homework.task3;

public class HouseMain {
    public static void main(String[] args) {
        HouseCatalog catalog = new HouseCatalog(5);

        catalog.addHouse(new House(10, 119, HouseType.APARTMENT));
        catalog.addHouse(new House(4, 47, HouseType.APARTMENT));
        catalog.addHouse(new House(2, 5, HouseType.COUNTRY_HOUSE));
        catalog.addHouse(new House(6, 64, HouseType.APARTMENT));
        catalog.addHouse(new House(7, 82, HouseType.APARTMENT));
        catalog.addHouse(new House(12, 167, HouseType.APARTMENT));
        catalog.addHouse(new House(9, 124, HouseType.APARTMENT));
        catalog.addHouse(new House(8, 112, HouseType.APARTMENT));

        catalog.enableHeating(5, 10);
    }
}
