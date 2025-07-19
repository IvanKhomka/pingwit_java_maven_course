package com.pingwit_java_course.part12.homework.task1;

import java.lang.reflect.Field;

public class SecretLockerMain {
    public static void main(String[] args) throws Exception {
        SecretLocker locker = new SecretLocker("first password");
        System.out.println("Before: " + locker);

        Field passwordField = SecretLocker.class.getDeclaredField("password");
        passwordField.setAccessible(true);

        passwordField.set(locker, "second password");
        System.out.println("After: " + locker);
    }
}