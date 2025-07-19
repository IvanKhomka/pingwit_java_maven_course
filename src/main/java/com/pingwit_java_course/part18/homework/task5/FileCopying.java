package com.pingwit_java_course.part18.homework.task5;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileCopying {
    public static void main(String[] args) {
        String sourceFileName = "src/com/pingwit_java_course/part18/homework/task5/racoon.jpg";
        File sourceFile = new File(sourceFileName);

        if (!sourceFile.exists()) {
            System.out.println("File was not found: " + sourceFileName);
            return;
        }

        String baseName = "racoon";
        String extension = ".jpg";

        File targetFile = new File(baseName + extension);
        int counter = 2;

        while (targetFile.exists()) {
            targetFile = new File(baseName + "(" + counter + ")" + extension);
            counter++;
        }

        try {
            Files.copy(sourceFile.toPath(), targetFile.toPath());
            System.out.println("File was successfully copied like: " + targetFile.getName());
        } catch (IOException e) {
            System.out.println("Error while copying a file: " + e.getMessage());
        }
    }
}