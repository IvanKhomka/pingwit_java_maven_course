package com.pingwit_java_course.part4.homework.task6;

public class EvenNumbersCount {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
