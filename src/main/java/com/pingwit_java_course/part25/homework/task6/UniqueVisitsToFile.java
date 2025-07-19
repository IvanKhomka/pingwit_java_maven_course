package com.pingwit_java_course.part25.homework.task6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueVisitsToFile {
    public static void main(String[] args) {
        List<Traveler> travelers = List.of(
                new Traveler("Ivan", List.of(
                        new Country("France", List.of("Paris", "Lyon")),
                        new Country("Germany", List.of("Berlin", "Munich"))
                )),
                new Traveler("Egorka", List.of(
                        new Country("France", List.of("Marseille", "Lyon")),
                        new Country("Italy", List.of("Rome", "Milan"))
                )),
                new Traveler("Anna", List.of(
                        new Country("Germany", List.of("Berlin")),
                        new Country("Italy", List.of("Venice", "Milan"))
                ))
        );

        String result = travelers.stream()
                .flatMap(traveler -> traveler.getVisitedCountries().stream())
                .flatMap(country -> country.getCities().stream())
                .distinct()
                .collect(Collectors.joining(", "));

        System.out.println("Unique cities: " + result);

        try {
            Files.writeString(Path.of("unique_cities.txt"), result);
            System.out.println("Successfully written to unique_cities.txt");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}