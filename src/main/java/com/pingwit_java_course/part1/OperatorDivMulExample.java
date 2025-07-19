package com.pingwit_java_course.part1;

public class OperatorDivMulExample {
    public static void main(String[] args) {
        int num_1 =5;
        int num_2 =2;
        int result = num_1 / num_2;
        System.out.println(result);
        System.out.println(num_1 * num_2);
        //System.out.println(5 / 0);
        System.out.println(5 * 0);

        System.out.println(2%6); //% mod , если sleva < prawo = sleva
        System.out.println(5 / 0.0);// infinity
        System.out.println(5/0.0 - 5/0.0);//NaN(Not a Number)
        System.out.println(5/2.0);//double
        System.out.println(5%2.0);//double

        System.out.println(1.45 + 1.58);//BigDecimal

        System.out.println(1.58*4.2);//BigDecimal
    }
}
