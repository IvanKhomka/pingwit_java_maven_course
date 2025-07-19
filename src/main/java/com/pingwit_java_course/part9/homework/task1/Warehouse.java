package com.pingwit_java_course.part9.homework.task1;

import java.util.Arrays;

public class Warehouse {
    private final int[] items;
    private int currentIndex = 0;

    public Warehouse(int[] initialItems) {
        this.items = new int[initialItems.length];
        for (int i = 0; i < initialItems.length; i++) {
            this.items[i] = initialItems[i];
        }
    }

    public int next() {
        int value = items[currentIndex];
        currentIndex = (currentIndex + 1) % items.length;
        return value;
    }

    public int[] getArray() {
        int[] copy = new int[items.length];
        for (int i = 0; i < items.length; i++) {
            copy[i] = items[i];
        }
        return copy;
    }

    @Override
    public String toString() {
        return "Warehouse" + Arrays.toString(items);
    }
}
