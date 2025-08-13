package com.pingwit_java_course.part30.homework.task2;

public class Film {
    public String title; // public -> private для всех полей
    public String year;
    public String country;
    public String genre;
    public String quality;
    public String duration;
    public String premiere;

    @Override
    public String toString() {
        return "Название фильма: " + title + "\n" +
                "Год выпуска: " + year + "\n" +
                "Страна: " + country + "\n" +
                "Жанр: " + genre + "\n" +
                "Качество: " + quality + "\n" +
                "Продолжительность: " + duration + "\n" +
                "Премьера: " + premiere + "\n";
    }
}