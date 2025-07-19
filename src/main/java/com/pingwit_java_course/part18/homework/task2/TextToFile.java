package com.pingwit_java_course.part18.homework.task2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TextToFile {
    public static void main(String[] args) {
        String sentence = "This is the line that will be written into file. ";
        String fileName = "myFile.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (int i = 0; i < 1000; i++) {
                writer.write(sentence);
            }
            System.out.println("File successfully written to: " + fileName);
        } catch (IOException e) {
            System.out.println("Failed to write into file: " + e.getMessage());
        }
    }
}