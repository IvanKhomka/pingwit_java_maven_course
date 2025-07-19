package com.pingwit_java_course.part12.homework.task3;

import java.lang.reflect.Method;

public class OpenTheLocker {
    public static void main(String[] args) throws Exception {
        Flat myFlat = new Flat();

        Class<?> flatClass = myFlat.getClass();

        Method openDoorMethod = flatClass.getDeclaredMethod("openDoor");

        openDoorMethod.setAccessible(true);

        System.out.println("Door opened without password " + openDoorMethod);
    }
}