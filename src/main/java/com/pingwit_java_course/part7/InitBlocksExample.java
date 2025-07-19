package com.pingwit_java_course.part7;

public class InitBlocksExample {
    public static void main(String[] args) {
        Student student = new Student();

        System.out.println("===");
        Student egorka = new Student("Egorka", null);
        System.out.println(egorka.happy);
    }
}
