package com.pingwit_java_course.part24.point_1;

@FunctionalInterface
public interface MyPredicate {
    boolean test(Integer num1, Integer num2);

    default void sayHi() {
        System.out.println("Hello from MyPredicate");
    }
}
