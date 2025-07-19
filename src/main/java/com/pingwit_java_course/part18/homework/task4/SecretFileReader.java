package com.pingwit_java_course.part18.homework.task4;

import java.io.RandomAccessFile;
import java.io.IOException;

public class SecretFileReader {
    public static void main(String[] args) {
        String imagePath = "src/com/pingwit_java_course/part18/homework/task4/image.jpg";

        try (RandomAccessFile raf = new RandomAccessFile(imagePath, "r")) {
            byte[] buffer = new byte[(int) raf.length()];
            raf.readFully(buffer);

            String content = new String(buffer);
            int secretIndex = content.indexOf("--SECRET--");

            if (secretIndex != -1) {
                String secretMessage = content.substring(secretIndex);
                System.out.println("Secret was found:\n" + secretMessage);
            } else {
                System.out.println("Secret message was not found.");
            }
        } catch (IOException e) {
            System.out.println("Error while reading: " + e.getMessage());
        }
    }
}