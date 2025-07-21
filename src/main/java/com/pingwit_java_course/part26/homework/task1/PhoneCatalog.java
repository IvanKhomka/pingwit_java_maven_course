package com.pingwit_java_course.part26.homework.task1;

import java.util.List;

public class PhoneCatalog {
    public static void main(String[] args) {
        List<Phone> phones = List.of(
                new Phone("iPhone 16"),
                new Phone("Samsung Galaxy S25 Ultra"),
                new Phone("iPhone 15"),
                new Phone("Realme GT 7 Pro"),
                new Phone("Samsung Galaxy S25 Ultra"),
                new Phone("iPhone 16")
        );

        List<Phone> uniquePhones = phones.stream()
                .distinct()
                .toList();

        System.out.println("Уникальные телефоны: " + uniquePhones);
    }
}