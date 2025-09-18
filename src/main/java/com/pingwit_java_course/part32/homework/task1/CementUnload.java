package com.pingwit_java_course.part32.homework.task1;

import java.util.*;

public class CementUnload {
    static final int WORKERS = 5;
    static final int MAX_WORKERS_PER_TRUCK = 3;

    public static void main(String[] args) throws InterruptedException {
        Truck truck1 = new Truck("Truck 1", 30, MAX_WORKERS_PER_TRUCK);
        Truck truck2 = new Truck("Truck 2", 30, MAX_WORKERS_PER_TRUCK);
        List<Truck> trucks = Arrays.asList(truck1, truck2);

        List<Integer> tiredWorkers = pickTiredWorkers(WORKERS, 3);
        System.out.println("Tired workers: " + tiredWorkers);

        List<Worker> workers = new ArrayList<>();
        List<Thread> threads = new ArrayList<>();

        for (int i = 1; i <= WORKERS; i++) {
            boolean tired = tiredWorkers.contains(i);
            Worker worker = new Worker(i, tired, trucks);
            workers.add(worker);
            Thread t = new Thread(worker);
            threads.add(t);
            t.start();
        }

        for (Thread t : threads) {
            t.join();
        }

        Worker best = workers.stream()
                .max(Comparator.comparingInt(Worker::getUnloadedBags))
                .orElseThrow();

        System.out.println("\nWinner: Worker " + best.getId() +
                " unloaded " + best.getUnloadedBags() + " bags and receives burger!");
    }

    static List<Integer> pickTiredWorkers(int total, int tiredCount) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= total; i++) list.add(i);
        Collections.shuffle(list);
        return list.subList(0, tiredCount);
    }
}