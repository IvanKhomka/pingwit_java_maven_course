package com.pingwit_java_course.part4.homework.task5;

public class InchesConverter {
    public static void main(String[] args) {
        double inchToCentimeterRate = 2.54;

        for (int i = 1; i <= 20; i++) {
            double result = i * inchToCentimeterRate;
            System.out.println("Conversation of " + i + " inches to cm = " + result + " cm");
        }
    }
}
