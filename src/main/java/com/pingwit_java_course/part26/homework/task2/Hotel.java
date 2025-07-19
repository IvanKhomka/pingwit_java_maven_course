package com.pingwit_java_course.part26.homework.task2;

record Hotel(String name, double rating) {
    @Override
    public String toString() {
        return "Лучший отель: " + name + " (рейтинг: " + rating + ")";
    }
}