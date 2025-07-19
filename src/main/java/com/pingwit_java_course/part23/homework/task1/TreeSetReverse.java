package com.pingwit_java_course.part23.homework.task1;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class TreeSetReverse {
    public static void main(String[] args) {
        TreeSet<Integer> reversed = new TreeSet<>(Collections.reverseOrder());
        reversed.addAll(List.of(1, 3, 5, 2, 4, 6));

        System.out.println("Reversed sorting: " + reversed);
    }
}