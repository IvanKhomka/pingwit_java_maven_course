package com.pingwit_java_course.part10.homework.task1;

public class ComputerTest {
    public static void main(String[] args) {
        Computer laptop = new Laptop();
        Computer desktop = new Desktop();

        System.out.println("Laptop modes test:");
        laptop.turnOn();
        laptop.reset();
        laptop.turnOff();

        System.out.println("Desktop modes test:");
        desktop.turnOn();
        desktop.reset();
        desktop.turnOff();

    }
}
