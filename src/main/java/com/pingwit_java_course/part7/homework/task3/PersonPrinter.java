package com.pingwit_java_course.part7.homework.task3;

import com.pingwit_java_course.part7.homework.task2.Person;

import java.util.Arrays;

public class PersonPrinter {
    public static void main(String[] args) {

        Person[] people = {
                new Person("Egor", 21),
                new Person("Aleksandr", 25),
                new Person("defaultPerson", 18)};
        System.out.println(Arrays.toString(people));
    }
}
