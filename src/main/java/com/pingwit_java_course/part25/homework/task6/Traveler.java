package com.pingwit_java_course.part25.homework.task6;

import java.util.List;

public class Traveler {
    private String name;
    private List<Country> visitedCountries;

    public Traveler(String name, List<Country> visitedCountries) {
        this.name = name;
        this.visitedCountries = visitedCountries;
    }

    public String getName() {
        return name;
    }

    public List<Country> getVisitedCountries() {
        return visitedCountries;
    }
}