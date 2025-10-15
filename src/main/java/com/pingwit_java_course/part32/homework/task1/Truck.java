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

    public synchronized boolean tryUnload(int workerId, boolean tired) { // аргументы не используются
        /* этот метод synchronized, поэтому
        if (bags.get() <= 0) {
            return false;
        } else {
            bags.decrementAndGet();
            return true;
         */
        if (bags.get() <= 0) {
            return false;
        }
        if (bags.decrementAndGet() >= 0) {
            return true;
        } else {
            bags.incrementAndGet();
            return false;
        }
    }

    public String getName() {
        return name;
    }
}