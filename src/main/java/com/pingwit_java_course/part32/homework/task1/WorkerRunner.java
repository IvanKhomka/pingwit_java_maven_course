package com.pingwit_java_course.part32.homework.task1;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class WorkerRunner implements Runnable {
    private static final double TIRED_MULTIPLIER = 1.5;
    private static final int BASE_WORK_TIME_MS = 300;
    private static final int REST_TIME_MS = 100;
    private final Worker worker;
    private final List<Truck> trucks;

    public WorkerRunner(Worker worker, List<Truck> trucks) {
        this.worker = worker;
        this.trucks = trucks;
    }

    @Override
    public void run() {
        for (Truck truck : trucks) {
            while (truck.hasBags()) {
                AtomicInteger slots = truck.getWorkerSlots();

                if (slots.decrementAndGet() >= 0) {
                    try {
                        if (truck.tryUnload()) {
                            simulateWork(truck, worker.getId(), worker.isTired());
                            worker.incrementBags();
                        } else {
                            break;
                        }
                    } finally {
                        slots.incrementAndGet();
                    }
                } else {
                    slots.incrementAndGet();
                    sleepShort();
                }
            }
        }

        System.out.println("Worker " + worker.getId() +
                " finished, unloaded " + worker.getUnloadedBags() + " bags.");
    }

    private void simulateWork(Truck truck, int workerId, boolean tired) {
        try {
            int workTime = tired ? (int) (BASE_WORK_TIME_MS * TIRED_MULTIPLIER) : BASE_WORK_TIME_MS;
            Thread.sleep(workTime);
            System.out.println("Worker " + workerId +
                    (tired ? " (tired)" : "") +
                    " unloaded bag from " + truck.getName());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private void sleepShort() {
        try {
            Thread.sleep(REST_TIME_MS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}