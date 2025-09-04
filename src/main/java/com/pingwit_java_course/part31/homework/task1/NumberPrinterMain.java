package com.pingwit_java_course.part31.homework.task1;

public class NumberPrinterMain {
    public static void main(String[] args) {
        Thread thread = new Thread(new NumberPrinter());
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread end.");
    }
}