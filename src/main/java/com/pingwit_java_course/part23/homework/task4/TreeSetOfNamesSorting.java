package com.pingwit_java_course.part23.homework.task4;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetOfNamesSorting {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>(Arrays.asList(
                "Egorka", "Vanya", "Anna", "Halina", "Georgi", "Walter", "Tatiana", "Masha", "Xenia"
        ));

        System.out.println(names);

        SortedSet<String> subSet = names.subSet("H", "X");

        System.out.println("Names from 'H' to 'W': " + subSet);
    }
}