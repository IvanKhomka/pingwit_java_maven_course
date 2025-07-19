package com.pingwit_java_course.part18.homework.task1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NumbersToFile {
    private static final String FILENAME = "Numbers.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many numbers you want to add: ");
        int numbersQuantity = scanner.nextInt();
        System.out.println("Enter numbers you want to write to file: ");
        int[] numbers = new int[numbersQuantity];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        try (FileWriter writer = new FileWriter(FILENAME)) {
            for (int number : numbers) {
                writer.write(number + " ");
            }
            System.out.println("Numbers written to file " + FILENAME);
        } catch (IOException e) {
            System.out.println("Error writing numbers to file");
        }
    }
}