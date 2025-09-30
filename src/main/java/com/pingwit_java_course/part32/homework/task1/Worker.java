package com.pingwit_java_course.part32.homework.task1;

public class Worker {
    private final int id;
    private final boolean tired;
    private int unloadedBags = 0;

    public Worker(int id, boolean tired) {
        this.id = id;
        this.tired = tired;
    }

    public int getId() {
        return id;
    }

    public boolean isTired() {
        return tired;
    }

    public int getUnloadedBags() {
        return unloadedBags;
    }

    public void incrementBags() {
        unloadedBags++;
    }
}