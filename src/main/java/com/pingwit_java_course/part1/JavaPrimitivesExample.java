package com.pingwit_java_course.part1;

public class JavaPrimitivesExample {
    public static void main(String[] args) {
        /*
        byte = 2^8 -> 256/2 = 128 -> -128 +127
        short 2^16 -> 65536/2
        char 2^16 -> 0 - 65536
        int 2^32
        long 2^64
         */

        /*
        float 3.4e−038 to 3.4e+038
        double
         */

        /*
        boolean -> true/false
         */

        byte myByte = 127;
        System.out.println(myByte);
        short myShort = 32767;
        System.out.println(myShort);
        int myInt = 32767;
        System.out.println(myInt);
        long myLong = 32767L;
        System.out.println(myLong);
        float myFloat = 32767.0f;
        System.out.println(myFloat);
        double myDouble = 32767.0;
        System.out.println(myDouble);
        char myChar = 'A';
        System.out.println(myChar);
        boolean myBoolean = true;
        System.out.println(myBoolean);
    }
}
