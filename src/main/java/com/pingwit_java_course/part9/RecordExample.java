package com.pingwit_java_course.part9;

import com.pingwit_java_course.part9.point_3.DogType;

public class RecordExample {
    public static void main(String[] args) {
        Dog dog = new Dog(DogType.MOPS, "brown");
        Dog dogClone = new Dog(DogType.MOPS, "brown");

        dog.color();
        dog.type();

        System.out.println(dog.equals(dogClone));
    }
}
