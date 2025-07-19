package com.pingwit_java_course.part11;

public class FibonacciExample {
    public static void main(String[] args) {

        int result = fibonacciRecursion(3);
        System.out.println("Result=" + result);
    }


    private static int fibonacciRecursion(int number) {
        System.out.println("Number=" + number);

        if (number < 2) {
            return number;
        }
        return fibonacciRecursion(number - 1) + fibonacciRecursion((number - 2));
    }
}
