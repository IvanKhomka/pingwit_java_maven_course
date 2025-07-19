package com.pingwit_java_course.part4.homework.task9;

public class TriangleToRhombus {
    public static void main(String[] args) {

        int size = 3;
        int tab = size - 1;
        int symbols = size;

        for (int i = 0; i < size * 2; i++) {
            for (int k = 0; k < tab; k++) {
                System.out.print(" ");
            }
            for (int k = tab; k <= symbols; k++) {
                System.out.print("*");
            }
            System.out.println();
            if (i < size - 1) {
                tab--;
                symbols++;
            } else if (i == tab) {
                tab = size - 1;
            } else {
                tab++;
                symbols--;
            }
        }
    }
}