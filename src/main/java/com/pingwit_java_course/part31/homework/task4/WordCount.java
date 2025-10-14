package com.pingwit_java_course.part31.homework.task4;

import java.util.ArrayList;
import java.util.List;

public class WordCount {
    public static void main(String[] args) {
        if (args.length == 0) {
            throw new IllegalArgumentException("Specify the paths to the files in the program arguments.");
        }

        List<Thread> threads = new ArrayList<>();
        for (String filePath : args) {
            Thread t = new Thread(new WordCountTask(filePath));
            threads.add(t);
            t.start();
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
}