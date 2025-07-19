package com.pingwit_java_course.part4.homework.task2;

public class AmoebaDiv {
    public static void main(String[] args) {

        int amoebaCell = 1;

        for (int divTime = 3; divTime <= 24; divTime += 3) {
            amoebaCell += amoebaCell;
            System.out.println("Total amoeba cells in " + divTime + " hours " + amoebaCell);
        }
    }
}
