package com.pingwit_java_course.part18.point_2;

import java.io.FileInputStream;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {
        try (FileInputStream file = new FileInputStream("src/com/pingwit_java_course/part18/point_2/FileInputStreamExample.java")) {
            int data;
            while ((data = file.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
