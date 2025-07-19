package com.pingwit_java_course.part1;

public class OperatorSumExample {
    public static void main(String[] args) {
        byte num_1 = 100;
        byte num_2 = 100;

        int sum = num_1 + num_2;
        /* так не делать
        byte  sum =(byte)(num_1+num_2);
        System.out.println(sum);
         */
        short num_3 = 50;
        short num_4 = 50;

        int shortSum = num_3 + num_4;

        int num_5 = 50;
        int num_6 = 50;

        int intSum = num_5 + num_6;

        long longNum = 300;

        long longSum = intSum + longNum;
        System.out.println(longSum);

        double doubleSum = 100;
        double doubleSuma = longSum + doubleSum;
        System.out.println(doubleSuma);
    }
}
