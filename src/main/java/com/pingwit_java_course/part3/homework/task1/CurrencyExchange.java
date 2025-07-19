package com.pingwit_java_course.part3.homework.task1;

import java.util.Scanner;

public class CurrencyExchange {
    public static void main(String[] args) {

        double plnRate = 4.1;
        double eurRate = 0.9;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter currency Id: 1 for PLN, 2 for EUR");
        int currencyId = scanner.nextInt();

        System.out.println("Enter USD amount to exchange");
        int amount = scanner.nextInt();

        switch (currencyId) {
            case 1 -> System.out.println("You received " + amount * plnRate + " PLN");
            case 2 -> System.out.println("You received " + amount * eurRate + " EUR");

            default -> System.out.println("Your bank can't exchange that type of currency");
        }
    }
}
