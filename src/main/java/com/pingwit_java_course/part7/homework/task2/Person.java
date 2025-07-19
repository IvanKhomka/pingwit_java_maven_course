package com.pingwit_java_course.part7.homework.task2;


public class Person {

    private String name;
    private int age;

    static {
        System.out.println("Создан новый экземпляр класса");
    }

    public Person() {
        this.name = "Aleksei";
        this.age = 18;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Имя: " + name + ",Возраст: " + age;
    }
}
