package com.pingwit_java_course.part31.homework.task2;

public class ToySupplier implements Runnable {
    private final ToyStore store;
    private final String name;
    private final int count;

    public ToySupplier(ToyStore store, String name, int count) {
        this.store = store;
        this.name = name;
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 1; i <= count; i++) {
            store.addToy(name + "-Toy" + i);
        }
    }
}