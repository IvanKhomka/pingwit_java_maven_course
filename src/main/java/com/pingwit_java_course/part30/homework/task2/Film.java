package com.pingwit_java_course.part30.homework.task2;

public class Film {
    private String title;
    private String year;
    private String country;
    private String genre;
    private String quality;
    private String duration;
    private String premiere;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getPremiere() {
        return premiere;
    }

    public void setPremiere(String premiere) {
        this.premiere = premiere;
    }

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