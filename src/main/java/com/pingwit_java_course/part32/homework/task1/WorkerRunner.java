package com.pingwit_java_course.part32.homework.task1;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class WorkerRunner implements Runnable {
    private final Worker worker;
    private final List<Truck> trucks;

    public WorkerRunner(Worker worker, List<Truck> trucks) {
        this.worker = worker;
        this.trucks = trucks;
    }

    @Override
    public void run() {
        /* Ты пробежишь по списку грузовиков 1 раз, и какой-то из грузовиков может неэффективно разгружаться.
        Но это не критично для первых проб многопоточного кода.
         */
        for (Truck truck : trucks) {
            while (truck.hasBags()) {
                AtomicInteger slots = truck.getWorkerSlots();

                if (slots.decrementAndGet() >= 0) {
                    try {
                        if (truck.tryUnload(worker.getId(), worker.isTired())) {
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
            int baseTime = 300;
            int workTime = tired ? (int) (baseTime * 1.5) : baseTime; // 1.5 магическое число в константу класса
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
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}