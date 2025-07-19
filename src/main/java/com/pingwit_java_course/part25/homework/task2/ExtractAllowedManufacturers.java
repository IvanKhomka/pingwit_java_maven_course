package com.pingwit_java_course.part25.homework.task2;

import java.util.List;
import java.util.Set;

public class ExtractAllowedManufacturers {
    public static void main(String[] args) {
        List<Phone> phones = List.of(
                new Phone("iPhone 13", "Apple"),
                new Phone("Galaxy S21", "Samsung"),
                new Phone("Mi 11", "Xiaomi"),
                new Phone("Pixel 6", "Google")
        );

        Set<String> allowedManufacturers = Set.of("Apple", "Samsung", "Xiaomi");

        List<String> manufacturers = phones.stream()
                .map(Phone::getManufacturer)
                .filter(allowedManufacturers::contains)
                .toList();

        System.out.println("Allowed manufacturers: " + manufacturers);
    }
}