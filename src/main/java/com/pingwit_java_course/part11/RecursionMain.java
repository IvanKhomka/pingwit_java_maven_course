package com.pingwit_java_course.part11;

public class RecursionMain {
    public static void main(String[] args) {
        show(0, 5);
    }

    private static void show(int from, int to) {
        if (from > to) {
            return;
        }
        show(++from, to);
        System.out.println(from);
    }
}
