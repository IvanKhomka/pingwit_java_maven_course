package com.pingwit_java_course.part1;

public class TypeCastingExample {
    public static void main(String[] args) {
        // повышение
        byte myByte = 127;
        int myInt = myByte;
        System.out.println(myInt);

        double myDouble = myInt;
        System.out.println(myDouble);

        //понижение
        int highInt = 400;
        byte highByte =(byte)highInt;
        System.out.println(highByte);

        double highDouble = 100.9;
        highInt = (int) highDouble;
        System.out.println(highInt);
    }
}
