package com.pingwit_java_course.part1;

public class OperatorComparisonExample {
    public static void main(String[] args) {
        // <,>,==,!=
        int num_1=100;
        int num_2=200;

        boolean result = num_1>num_2;//boolean
        System.out.println(result);
        System.out.println(num_1<num_2);
        System.out.println(num_1==num_2);
        System.out.println(num_1!=num_2);

        boolean b_1 = true;
        boolean b_2 = false;
        System.out.println(b_1 == b_2);// <,> nelzya
        System.out.println(b_1!=b_2);
    }
}
