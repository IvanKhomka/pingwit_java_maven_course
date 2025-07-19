package com.pingwit_java_course.part19.homework.task3;

import java.io.File;
import java.io.IOException;

public class FilesCatalog {
    public static void main(String[] args) throws IOException {
        File file = new File("src/com/pingwit_java_course/part19");
        printFileStructure("", file.listFiles());
    }

    private static void printFileStructure(String tab, File[] files) {
        if (files == null){
            return;
        }

        for (File file : files) {
            if (file.isFile()) {
                System.out.println(tab + file.getName());
            } else if (file.isDirectory()) {
                System.out.println(tab + "[DIRECTORY] " + file.getName());
                printFileStructure(tab + "  ", file.listFiles());
            }
        }
    }
}