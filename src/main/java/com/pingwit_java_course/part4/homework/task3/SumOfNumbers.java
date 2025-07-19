package com.pingwit_java_course.part4.homework.task3;

public class SumOfNumbers {
    public static void main(String[] args) {
        int totalSum = 1;

        for (int firstNumber = 2; firstNumber <= 256; firstNumber++) {
            if (firstNumber % 2 == 0) {
                totalSum += firstNumber;
            }
        }
        System.out.println("Total sum is " + totalSum);
    }
}
