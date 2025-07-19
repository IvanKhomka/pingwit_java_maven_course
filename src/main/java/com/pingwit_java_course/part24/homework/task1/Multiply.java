package com.pingwit_java_course.part24.homework.task1;

import java.util.function.BinaryOperator;

public class Multiply {
    public static void main(String[] args) {
        BinaryOperator<Integer> multiply = (a, b) -> a * b;

        System.out.println(multiply.apply(2, 3));
        System.out.println(multiply.apply(7, 8));
        System.out.println(multiply.apply(4, 2));
    }
}