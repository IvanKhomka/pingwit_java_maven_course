package com.pingwit_java_course.part26.homework.task1;

import java.util.List;

public class PhoneCatalog {
    public static void main(String[] args) {
        List<String> phones = List.of(
                "iPhone 16",
                "Samsung Galaxy S25 Ultra",
                "iPhone 15",
                "Realme GT 7 Pro",
                "Samsung Galaxy S25 Ultra",
                "iPhone 16"
        );

        List<String> uniquePhones = phones.stream()
                .distinct()
                .toList();

        System.out.println("Уникальные телефоны: " + uniquePhones);
    }
}