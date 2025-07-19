package com.pingwit_java_course.part1;

public class OperatorShiftExample {
    public static void main(String[] args) {
    // <<, >>
        System.out.println(4);
        // 4, 2, 1 ->0,0,1 -> 1,0,0
        System.out.println(0b100);
        // 1,0,0 << 2 ->1,0,0,0,0
        //1,0,0,0,0 -> 16
        System.out.println(4<<2); // 4 * 4(2^2)
        System.out.println(2 << 31);// 2^30, pri vihode za diapozon 0
        long num = 2;
        System.out.println(num << 31);

        // 1,0,0 -> 2 -> 0,0,1
        System.out.println(0b001);
        System.out.println(4>>2);//4 / 2^2 ->1
    }
}
