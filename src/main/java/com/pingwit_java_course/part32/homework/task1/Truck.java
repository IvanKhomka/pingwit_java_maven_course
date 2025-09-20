package com.pingwit_java_course.part32.homework.task1;

import java.util.concurrent.atomic.AtomicInteger;

public class Truck {
    private final String name;
    private final AtomicInteger bags;
    private final AtomicInteger workers; // поля workers и maxWorkers лучше вынести за пределы Truck. Задача Truck называться и перевозить мешки, контроль за кол-вом работников задача, например, прораба (можно в методе мейн, можно добавить сервис)
    private final int maxWorkers;

    public Truck(String name, int bagCount, int maxWorkers) {
        this.name = name;
        this.bags = new AtomicInteger(bagCount);
        this.workers = new AtomicInteger(0);
        this.maxWorkers = maxWorkers;
    }

    public boolean hasBags() {
        return bags.get() > 0;
    }

    public boolean tryUnload(int workerId, boolean tired) {
        if (!hasBags()) return false;

        if (workers.incrementAndGet() > maxWorkers) {
            workers.decrementAndGet();
            return false;
        }

        try {
            if (bags.get() > 0) {
                bags.decrementAndGet();
                simulateWork(workerId, tired);
                return true;
            }
        } finally {
            workers.decrementAndGet();
        }
        return false;
    }

    private void simulateWork(int workerId, boolean tired) {
        try {
            int baseTime = 300;
            int workTime = tired ? (int) (baseTime * 1.5) : baseTime;
            Thread.sleep(workTime);
            System.out.println("Worker " + workerId +
                    (tired ? " (tired)" : "") +
                    " unloaded bag with " + name);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}