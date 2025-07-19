package com.pingwit_java_course.part1;

public class IncrementOperatorExample {
    public static void main(String[] args) {
        int x = 0;
        x = x+1;
        System.out.println(x);
        x++;
        System.out.println(x);
        ++x;
        System.out.println(x);

        System.out.println("===");
        System.out.println(x++); // sout(x) -> x+1
        System.out.println(x);
        System.out.println("===");
        System.out.println(++x);//x+1 -> sout(x)
        System.out.println(x);

        x--;
        x++;
        System.out.println(x);
    }
}
