package com.pingwit_java_course.part31.homework.task4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Specify the paths to the files in the program arguments.");
            return;
        }

        Thread[] threads = new Thread[args.length];
        for (int i = 0; i < args.length; i++) {
            String filePath = args[i];
            threads[i] = new Thread(() -> {
                int count = countWords(filePath);
                System.out.println("File: " + filePath + " — words: " + count);
            });
            threads[i].start();
        }

        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Total files processed: " + args.length);
    }

    private static int countWords(String path) {
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                count += line.split("\\s+").length;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }
}