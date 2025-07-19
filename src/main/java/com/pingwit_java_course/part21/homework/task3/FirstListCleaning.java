package com.pingwit_java_course.part21.homework.task3;

import java.util.ArrayList;
import java.util.List;

public class FirstListCleaning {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        list1.add("E");

        list2.add("B");
        list2.add("D");

        list1.removeAll(list2);

        System.out.println("Result after removal: " + list1);
    }
}