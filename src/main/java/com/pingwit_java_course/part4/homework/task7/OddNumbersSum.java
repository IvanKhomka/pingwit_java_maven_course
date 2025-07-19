package com.pingwit_java_course.part4.homework.task7;

public class OddNumbersSum {
    public static void main(String[] args) {

        int sumOfOddNumbers = 0;

        for (int oddNumber = 1; oddNumber <= 99; oddNumber++) {
            if (oddNumber % 2 != 0) {
                sumOfOddNumbers += oddNumber;
            }
        }
        System.out.println("Sum of odd numbers = " + sumOfOddNumbers);
    }
}
