package com.pingwit_java_course.part24.homework.task2;

import java.util.function.Function;

public class CurrencyConverter {
    public static void main(String[] args) {
        Function<Integer, String> toRublesCorrect = amount -> {
            int lastDigit = amount % 10;
            int lastTwoDigits = amount % 100;
            String suffix;
            if (lastTwoDigits >= 11 && lastTwoDigits <= 19) {
                suffix = "рублей";
            } else if (lastDigit == 1) {
                suffix = "рубль";
            } else if (lastDigit >= 2 && lastDigit <= 4) {
                suffix = "рубля";
            } else {
                suffix = "рублей";
            }
            return amount + " " + suffix;
        };

        System.out.println(toRublesCorrect.apply(21));
        System.out.println(toRublesCorrect.apply(2));
        System.out.println(toRublesCorrect.apply(1));
        System.out.println(toRublesCorrect.apply(15));
        System.out.println(toRublesCorrect.apply(32));
        System.out.println(toRublesCorrect.apply(47));
    }
}