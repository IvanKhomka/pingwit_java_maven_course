package com.pingwit_java_course.part31.homework.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PopularBooksMain {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Ivan", Arrays.asList(
                new Book("Harry Potter", 1997),
                new Book("Lord Of The Rings", 1954),
                new Book("1984", 1949))));

        students.add(new Student("Egorka", Arrays.asList(
                new Book("1984", 1949),
                new Book("Harry Potter", 1997),
                new Book("Master and Margarita", 1967))));

        students.add(new Student("Elena", Arrays.asList(
                new Book("Harry Potter", 1997),
                new Book("Lord Of The Rings", 1954))));

        Map<Book, Integer> popularity = new HashMap<>();

        for (Student s : students) {
            for (Book b : s.getBooks()) {
                popularity.put(b, popularity.getOrDefault(b, 0) + 1);
            }
        }

        popularity.entrySet().stream()
                .sorted((a, b) -> b.getValue() - a.getValue())
                .limit(3)
                .forEach(entry ->
                        System.out.println(entry.getKey().getTitle() + " — " + entry.getValue() + " students"));
    }
}