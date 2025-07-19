package com.pingwit_java_course.part6.homework.task4;

public class TableOfMultiplication {
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (i + 1) * (j + 1);
                System.out.printf("%3s|", array[i][j]);
            }
            System.out.println();
        }
    }
}
