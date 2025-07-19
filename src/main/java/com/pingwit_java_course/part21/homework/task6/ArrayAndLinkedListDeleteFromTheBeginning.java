package com.pingwit_java_course.part21.homework.task6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayAndLinkedListDeleteFromTheBeginning {
    public static void main(String[] args) {
        int size = 100_000;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long start = System.currentTimeMillis();
        while (!arrayList.isEmpty()) {
            arrayList.remove(0);
        }
        long end = System.currentTimeMillis();
        System.out.println("ArrayList deleting from the beginning: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        while (!linkedList.isEmpty()) {
            linkedList.remove(0);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList deleting from the beginning: " + (end - start) + " ms");
    }
}