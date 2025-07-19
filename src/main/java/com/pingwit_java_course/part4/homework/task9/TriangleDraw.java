package com.pingwit_java_course.part4.homework.task9;

public class TriangleDraw {
    public static void main(String[] args) {

        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= 4; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

