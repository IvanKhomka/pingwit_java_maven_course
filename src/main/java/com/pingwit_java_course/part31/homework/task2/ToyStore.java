package com.pingwit_java_course.part31.homework.task2;

import java.util.ArrayList;
import java.util.List;

public class ToyStore {
    private final List<String> toys = new ArrayList<>();

    public synchronized void addToy(String toy) {
        toys.add(toy);
    }

    public List<String> getToys() {
        return toys;
    }
}