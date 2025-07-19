package com.pingwit_java_course.part8.homework.task3;

public class HouseCatalog {
    private static final int CATALOG_EXPANSION = 2;
    private House[] houses;
    private int lastHouseIndex = 0;

    public HouseCatalog(int initialCapacity) {
        houses = new House[initialCapacity];
    }

    public void addHouse(House house) {
        if (lastHouseIndex >= houses.length) {
            expandCatalog();
        }
        houses[lastHouseIndex++] = house;
    }

    private void expandCatalog() {
        int newSize = houses.length * CATALOG_EXPANSION;
        House[] newHouses = new House[newSize];
        System.arraycopy(houses, 0, newHouses, 0, houses.length);
        houses = newHouses;
        System.out.println("Каталог расширен до " + newSize + " домов.");
    }

    public void enableHeating(int minFloors, int minResidents) {
        for (int i = 0; i < lastHouseIndex; i++) {
            if (houses[i] != null && houses[i].getFloors() > minFloors && houses[i].getResidents() > minResidents) {
                houses[i].enableHeating();
            }
        }
    }
}
