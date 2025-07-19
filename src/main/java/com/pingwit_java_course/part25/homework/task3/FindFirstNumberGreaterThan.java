package com.pingwit_java_course.part25.homework.task3;

import java.util.List;
import java.util.Optional;

public class FindFirstNumberGreaterThan {
    private static final int THRESHOLD = 22;

    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 18, 21, 23, 30, 12);
        Optional<Integer> result = numbers.stream()
                .filter(n -> n > THRESHOLD)
                .findFirst();
        System.out.println("First number greater than " + THRESHOLD + ": " + result);
    }
}