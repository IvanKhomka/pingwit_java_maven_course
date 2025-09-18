package com.pingwit_java_course.part31.homework.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

        students.stream()
                .flatMap(s -> s.getBooks().stream())
                .collect(Collectors.toMap(
                        b -> b,
                        b -> 1,
                        Integer::sum))
                .entrySet().stream()
                .sorted(Map.Entry.<Book, Integer>comparingByValue().reversed())
                .limit(3)
                .forEach(entry ->
                        System.out.println(entry.getKey().getTitle() + " — " + entry.getValue() + " students"));
    }
}