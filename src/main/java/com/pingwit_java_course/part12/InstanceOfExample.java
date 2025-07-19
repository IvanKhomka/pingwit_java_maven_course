package com.pingwit_java_course.part12;

public class InstanceOfExample {
    public static void main(String[] args) {

        AnimalInstanceOf animal = new Sheep();

        if (animal instanceof Sheep) {
            System.out.println("This is an: " + animal.getClass().getName());
            Sheep sheep = (Sheep) animal;
            sheep.sayHi();
        } else {
            System.out.println("Unknown type: " + animal.getClass().getName());
        }
    }
}

interface AnimalInstanceOf {
}

class Sheep implements AnimalInstanceOf {

    public void sayHi() {
        System.out.println("hello");
    }
}

class Cow implements AnimalInstanceOf {

}
