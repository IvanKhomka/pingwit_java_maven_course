package com.pingwit_java_course.part7.homework.task4;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class InsuranceCalculation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите объем двигателя в см3:");
        BigDecimal engineVolume = scanner.nextBigDecimal();

        System.out.println("Были ли ДТП за прошлый год?(true/false):");
        boolean hasCrashes = scanner.nextBoolean();

        System.out.println("Страховались ли у нас?(true/false):");
        boolean hadInsurance = scanner.nextBoolean();

        BigDecimal rate = new BigDecimal("0.25");
        BigDecimal regularCustomerRate = hadInsurance ? new BigDecimal("0.8") : BigDecimal.ONE;
        BigDecimal crashedCustomerRate = hasCrashes ? new BigDecimal("1.2") : BigDecimal.ONE;
        BigDecimal totalInsurance = engineVolume.multiply(rate)
                .multiply(regularCustomerRate)
                .multiply(crashedCustomerRate)
                .setScale(2, RoundingMode.HALF_UP);

        System.out.println("Стоимость вашей страховки составила: " + totalInsurance + " Евро.");
    }
}