package com.pingwit_java_course.part13.homework;

import java.util.Scanner;

public class CrookedRoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose travel time in seconds, please: ");
        int seconds = scanner.nextInt();

        long startTime = System.currentTimeMillis();
        long endTime = startTime + seconds * 1000L;

        int position = 0;
        boolean movingRight = true;
        int maxOffset = 8;

        while (System.currentTimeMillis() < endTime) {

            for (int i = 0; i < position; i++) {
                System.out.print(" ");
            }
            System.out.println("|| | ||");

            if (movingRight) {
                position++;
                if (position == maxOffset) {
                    movingRight = false;
                }
            } else {
                position--;
                if (position == 0) {
                    movingRight = true;
                }
            }
        }
    }
}