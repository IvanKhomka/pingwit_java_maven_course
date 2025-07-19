package com.pingwit_java_course.part15.point_4;

import java.io.IOException;

public class ToyotaExample {
    public static void main(String[] args) {
        Toyota toyota = new Toyota();

        try {
            toyota.start();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
