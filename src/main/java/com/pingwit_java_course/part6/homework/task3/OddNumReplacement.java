package com.pingwit_java_course.part6.homework.task3;

import java.util.Arrays;

public class OddNumReplacement {
    public static void main(String[] args) {
        int[] array = {7, 21, 32, 33, 14, 52, 64, 20, 88};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
