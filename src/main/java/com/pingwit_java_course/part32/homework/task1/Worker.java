package com.pingwit_java_course.part32.homework.task1;

import java.util.List;
import java.util.Random;

public class Worker implements Runnable {
    private final int id;
    private final boolean tired;
    private final List<Truck> trucks; // trucks для данной задачи я бы вынес за пределы Worker
    private int unloadedBags = 0;
    private final Random random = new Random();

    public Worker(int id, boolean tired, List<Truck> trucks) {
        this.id = id;
        this.tired = tired;
        this.trucks = trucks;
    }

    @Override
    public void run() {
        while (trucks.stream().anyMatch(Truck::hasBags)) {
            Truck truck = trucks.get(random.nextInt(trucks.size()));
            if (truck.tryUnload(id, tired)) {
                unloadedBags++;
            }
        }
        System.out.println("Worker " + id + " finished, unloaded " + unloadedBags + " bags.");
    }

    public int getId() {
        return id;
    }

    public int getUnloadedBags() {
        return unloadedBags;
    }
}