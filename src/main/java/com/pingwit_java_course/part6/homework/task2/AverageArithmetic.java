package com.pingwit_java_course.part6.homework.task2;

public class AverageArithmetic {
    public static void main(String[] args) {
        int[] array = {2, 3};
        double sum = 0;
        for (int elem : array) {
            sum += elem;
        }
        double average = sum / array.length;
        System.out.println("The average arithmetic of array = " + average);
    }
}

