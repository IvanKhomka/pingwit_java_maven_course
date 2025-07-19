package com.pingwit_java_course.part21.homework.task4;

import java.util.ArrayList;
import java.util.List;

public class FirstListIntersection {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        list1.add("Q");
        list1.add("Y");
        list1.add("Z");
        list1.add("S");
        list1.add("K");

        list2.add("S");
        list2.add("Q");

        list1.retainAll(list2);

        System.out.println("Result after intersection: " + list1);
    }
}