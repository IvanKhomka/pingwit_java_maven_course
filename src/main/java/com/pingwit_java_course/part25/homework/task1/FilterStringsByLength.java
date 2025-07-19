package com.pingwit_java_course.part25.homework.task1;

import java.util.List;

public class FilterStringsByLength {
    private static final int MIN_LENGTH = 5;

    public static void main(String[] args) {
        List<String> strings = List.of("cat", "elephant", "house", "sun", "planet");
        List<String> filtered = strings.stream()
                .filter(s -> s.length() >= MIN_LENGTH)
                .toList();
        System.out.println("Strings with length >= " + MIN_LENGTH + ": " + filtered);
    }
}