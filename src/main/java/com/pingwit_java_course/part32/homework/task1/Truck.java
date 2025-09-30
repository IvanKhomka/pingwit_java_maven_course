package com.pingwit_java_course.part32.homework.task1;

import java.util.concurrent.atomic.AtomicInteger;

public class Truck {
    private final String name;
    private final AtomicInteger bags;

    public Truck(String name, int bagCount) {
        this.name = name;
        this.bags = new AtomicInteger(bagCount);
    }

    public boolean hasBags() {
        return bags.get() > 0;
    }

    public boolean tryUnload(int workerId, boolean tired) {
        if (!hasBags()) return false; //всегда добавляй {}

        if (bags.decrementAndGet() >= 0) {
            simulateWork(workerId, tired);
            return true;
        } else {
            bags.incrementAndGet();
            return false;
        }
    }

    private void simulateWork(int workerId, boolean tired) {
        try {
            int baseTime = 300;
            int workTime = tired ? (int) (baseTime * 1.5) : baseTime;
            Thread.sleep(workTime);
            System.out.println("Worker " + workerId +
                    (tired ? " (tired)" : "") +
                    " unloaded bag from " + name);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}