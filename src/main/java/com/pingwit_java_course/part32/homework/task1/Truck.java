package com.pingwit_java_course.part32.homework.task1;

import java.util.concurrent.atomic.AtomicInteger;

public class Truck {
    private final String name;
    private final AtomicInteger bags;
    private final AtomicInteger workerSlots;

    public Truck(String name, int bagCount, int workerSlotCount) {
        this.name = name;
        this.bags = new AtomicInteger(bagCount);
        this.workerSlots = new AtomicInteger(workerSlotCount);
    }

    public AtomicInteger getWorkerSlots() {
        return workerSlots;
    }

    public synchronized boolean hasBags() {
        return bags.get() > 0;
    }

    public synchronized boolean tryUnload() {
        if (bags.get() <= 0) {
            return false;
        } else {
            bags.decrementAndGet();
            return true;
        }
    }

    public String getName() {
        return name;
    }
}