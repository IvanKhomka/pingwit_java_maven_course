package com.pingwit_java_course.part8.homework.task3;

public class House {
    private int floors;
    private int residents;
    private boolean heatingOn;
    private HouseType houseType;

    public House(int floors, int residents, HouseType houseType) {
        this.floors = floors;
        this.residents = residents;
        this.heatingOn = false;
        this.houseType = houseType;
    }

    public int getFloors() {
        return floors;
    }

    public int getResidents() {
        return residents;
    }

    public HouseType getHouseType() {
        return houseType;
    }

    public void enableHeating() {
        if (!heatingOn) {
            heatingOn = true;
            System.out.println("Отопление включено в " + houseType.getName() + " с " + floors + " этажами и " + residents + " жильцами.");
        }
    }

    public boolean isHeatingOn() {
        return heatingOn;
    }
}
