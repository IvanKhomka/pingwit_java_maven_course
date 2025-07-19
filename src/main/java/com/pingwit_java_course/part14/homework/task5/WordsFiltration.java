package com.pingwit_java_course.part14.homework.task5;

public class WordsFiltration {
    public static void main(String[] args) {
        String[] words = {"Wave", "West", "Walk", "Window", "Watermelon", "Winter", "Woman", "Worm",
                "spin", "king", "games", "graphics", "java", "lazy", "peace", "ivan", "learn",
                "wear", "white", "wan", "whine", "wizard"};

        int count = 0;
        for (String word : words) {
            if (word.startsWith("W") || word.startsWith("w")) {
                count++;
            }
        }

        String[] filteredWords = new String[count];

        int index = 0;

        for (String word : words) {
            if (word.startsWith("W") || word.startsWith("w")) {
                filteredWords[index] = word;
                index++;
            }
        }

        System.out.println("Filtered words: " + String.join(", ", filteredWords));
    }
}