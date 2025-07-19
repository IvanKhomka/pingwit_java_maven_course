package com.pingwit_java_course.part6.homework.task1;

import java.util.Scanner;

public class UserArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please, enter the number: ");
            numbers[i] = scanner.nextInt();
        }

        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;
        for (int element : numbers) {
            sum += element;
            if (element < min) {
                min = element;
            }
            if (element > max) {
                max = element;
            }
        }

        System.out.println("The sum of numbers in your array = " + sum);
        System.out.println("The biggest number in your array = " + max);
        System.out.println("The minimal number in your array = " + min);
    }
}
