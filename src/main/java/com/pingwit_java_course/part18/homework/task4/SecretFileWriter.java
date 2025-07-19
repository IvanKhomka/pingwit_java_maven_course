package com.pingwit_java_course.part18.homework.task4;

import java.io.FileOutputStream;
import java.io.IOException;

public class SecretFileWriter {
    public static void main(String[] args) {
        String secretMessage = "\n--SECRET--\nThis is a secret message from racoon.\n\n";
        String imagePath = "src/com/pingwit_java_course/part18/homework/task4/image.jpg";

        try (FileOutputStream fos = new FileOutputStream(imagePath, true)) {
            fos.write(secretMessage.getBytes());
            System.out.println("Secret message written to: " + imagePath);
        } catch (IOException e) {
            System.out.println("Error while writing " + e.getMessage());
        }
    }
}