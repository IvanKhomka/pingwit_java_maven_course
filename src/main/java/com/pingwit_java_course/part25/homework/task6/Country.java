package com.pingwit_java_course.part25.homework.task6;

import java.util.List;

public class Country {
    private String country;
    private List<String> cities;

    public Country(String country, List<String> cities) {
        this.country = country;
        this.cities = cities;
    }

    public String getCountry() {
        return country;
    }

    public List<String> getCities() {
        return cities;
    }
}