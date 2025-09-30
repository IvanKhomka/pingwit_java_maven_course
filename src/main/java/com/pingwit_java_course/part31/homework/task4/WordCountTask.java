package com.pingwit_java_course.part31.homework.task4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCountTask implements Runnable {
    private final String filePath;

    public WordCountTask(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void run() {
        int count = countWords(filePath);
        System.out.println("File: " + filePath + " — words: " + count);
    }

    private int countWords(String path) {
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.trim().split("\\s+");
                if (words.length == 1 && words[0].isEmpty()) continue;
                count += words.length;
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + path);
            e.printStackTrace();
        }
        return count;
    }
}