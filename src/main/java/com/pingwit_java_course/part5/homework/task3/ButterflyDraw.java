package com.pingwit_java_course.part5.homework.task3;

import java.util.Scanner;

public class ButterflyDraw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of butterfly from 1 to 9, please: ");
        int size = scanner.nextInt();

        int leftPart = 1;
        int rightPart = size * 2 - 1;
        int tab;

        // можешь оставить в таком виде, но ты в одном шаге от 3х циклов. Но это не принципиально
        // оставлю в таком виде
        for (int i = 0; i < size; i++) {
            tab = 1;
            for (int j = 0; j < size * 2; j++) {
                if (j < leftPart) {
                    System.out.print(tab);
                    tab++;
                } else if (j < rightPart) {
                    System.out.print(" ");
                } else {
                    tab--;
                    System.out.print(tab);
                }
            }
            leftPart++;
            rightPart--;
            System.out.println();
        }

        leftPart = size - 1;
        rightPart = size + 1;

        for (int i = 0; i < size; i++) {
            tab = 1;
            for (int j = 0; j < size * 2; j++) {
                if (j < leftPart) {
                    System.out.print(tab);
                    tab++;
                } else if (j < rightPart) {
                    System.out.print(" ");
                } else {
                    tab--;
                    System.out.print(tab);
                }
            }
            leftPart--;
            rightPart++;
            System.out.println();
        }
    }
}