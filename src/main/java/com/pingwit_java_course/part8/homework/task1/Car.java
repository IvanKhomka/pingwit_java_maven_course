package com.pingwit_java_course.part8.homework.task1;

public class Car {
    private String producer; //private
    private String model; //private
    private int doorsQuantity; //private

    public Car(String producer, String model, int doors) {
        this.producer = producer;
        this.model = model;
        this.doorsQuantity = doors;
    }

    public void openDoors() {
        for (int i = 1; i <= doorsQuantity; i++) {
            System.out.println("Дверь " + i + " открыта");
        }
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public int getDoorsQuantity() {
        return doorsQuantity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", doorsQuantity=" + doorsQuantity +
                '}';
    }
}

