package com.pingwit_java_course.part32.homework.task1;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CementUnload {
    private static final int WORKERS = 5;
    private static final int MAX_WORKERS_PER_TRUCK = 3;

    public static void main(String[] args) throws InterruptedException {
        Truck truck1 = new Truck("Truck 1", 30);
        Truck truck2 = new Truck("Truck 2", 30);
        List<Truck> trucks = List.of(truck1, truck2);

        List<Integer> tiredWorkers = pickTiredWorkers(WORKERS, 3); // 3 магическое число
        System.out.println("Tired workers: " + tiredWorkers);

        ExecutorService executor = Executors.newFixedThreadPool(WORKERS);
        List<Worker> workers = new ArrayList<>();

        Map<Truck, AtomicInteger> truckAssignments = new HashMap<>();
        for (Truck t : trucks) {
            truckAssignments.put(t, new AtomicInteger(0));
        }

        for (int i = 1; i <= WORKERS; i++) {
            boolean tired = tiredWorkers.contains(i); // Вызов contains - на листе O(n), на HashSet O(1). Т.е. метод pickTiredWorkers лучше возвращал бы HashSet
            Worker worker = new Worker(i, tired);
            workers.add(worker);
            executor.submit(() -> runWorker(worker, trucks, truckAssignments));
        }

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.HOURS);

        Worker best = workers.stream()
                .max(Comparator.comparingInt(Worker::getUnloadedBags))
                .orElseThrow();

        System.out.println("\nWinner: Worker " + best.getId() +
                " unloaded " + best.getUnloadedBags() + " bags and receives burger!");
    }

    private static void runWorker(Worker worker,
                                  List<Truck> trucks,
                                  Map<Truck, AtomicInteger> assignments) { // это у нас тоже кандидат на отдельный Runnable класс
        Random random = new Random();

        while (trucks.stream().anyMatch(Truck::hasBags)) {
            Truck truck = trucks.get(random.nextInt(trucks.size()));
            AtomicInteger counter = assignments.get(truck);

            if (counter.get() < MAX_WORKERS_PER_TRUCK && truck.hasBags()) {
                counter.incrementAndGet();
                try {
                    if (truck.tryUnload(worker.getId(), worker.isTired())) {
                        worker.incrementBags();
                    }
                } finally {
                    counter.decrementAndGet();
                }
            }
        }
        System.out.println("Worker " + worker.getId() +
                " finished, unloaded " + worker.getUnloadedBags() + " bags.");
    }

    private static List<Integer> pickTiredWorkers(int total, int tiredCount) { // List<Integer> - лучше возвращать Set<Integer>
        /*
        Попробуй проанализировать этот код и понять, почему он будет эффективнее.
        Ответ можно сюда комментарием.

        Random random = new Random();

        Set<Integer> workers = new HashSet<>();
        for (int i = 0; i < total; i++) {
            workers.add(i);
        }

        Set<Integer> tiredWorkers = new HashSet<>();
        for (int i = 0; i < tiredCount; i++) {
            int tiredWorker = random.nextInt(workers.size());
            tiredWorkers.add(tiredWorker);
            workers.remove(tiredWorker);
        }*/

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= total; i++) list.add(i); //всегда используй {} для циклов и условных операторов
        Collections.shuffle(list);
        return list.subList(0, tiredCount);
    }
}