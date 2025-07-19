package com.pingwit_java_course.part4.homework.task8;

public class NumbersCount {
    public static void main(String[] args) {

        int oddNumbersSum = 0;
        int evenNumbersSum = 0;
        int totalNumbersSum = 0;

        for (int numbersQuantity = 0; numbersQuantity <= 100; numbersQuantity++) {
            if (numbersQuantity % 2 == 0) {
                oddNumbersSum += numbersQuantity;
            } else {
                evenNumbersSum += numbersQuantity;
            }
            totalNumbersSum += numbersQuantity;
        }
        System.out.println("Number of odd numbers: " + oddNumbersSum);
        System.out.println("Number of even numbers: " + evenNumbersSum);
        System.out.println("Total numbers sum: " + totalNumbersSum);
    }
}
