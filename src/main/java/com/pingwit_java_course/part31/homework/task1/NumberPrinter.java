package com.pingwit_java_course.part31.homework.task1;

public class NumberPrinter implements Runnable {
    private final int counter;

    public NumberPrinter(int counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i <= counter; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}