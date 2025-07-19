package com.pingwit_java_course.part18.homework.task3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadAndShow {
    public static void main(String[] args) {
        String fileName = "myFile.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error while reading a file: " + e.getMessage());
        }
    }
}