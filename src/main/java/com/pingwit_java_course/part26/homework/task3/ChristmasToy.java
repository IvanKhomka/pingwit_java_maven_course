package com.pingwit_java_course.part26.homework.task3;

record ChristmasToy(String name, boolean hasHook) {
    @Override
    public String toString() {
        return name + (hasHook ? " (с крепежом)" : " (без крепежа)");
    }
}