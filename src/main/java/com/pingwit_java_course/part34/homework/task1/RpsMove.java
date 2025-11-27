package com.pingwit_java_course.part34.homework.task1;

public enum RpsMove {
    ROCK,
    PAPER,
    SCISSORS;

    public static RpsMove random() {
        RpsMove[] values = RpsMove.values();
        return values[(int) (Math.random() * values.length)];
    }
}