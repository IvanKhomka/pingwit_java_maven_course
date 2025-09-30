package com.pingwit_java_course.part31.homework.task1;

public class NumberPrinterMain {
    public static void main(String[] args) {
        try {
            Thread thread = new Thread(new NumberPrinter(20));
            thread.start();
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread end.");
    }
}