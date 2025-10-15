package com.pingwit_java_course.part32.homework.task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CementUnload {
    private static final int WORKERS = 5;
    private static final int MAX_WORKERS_PER_TRUCK = 3;
    private static final int TIRED_WORKERS = 3;

    public static void main(String[] args) throws InterruptedException {
        Truck truck1 = new Truck("Truck 1", 30, MAX_WORKERS_PER_TRUCK);
        Truck truck2 = new Truck("Truck 2", 30, MAX_WORKERS_PER_TRUCK);
        List<Truck> trucks = new CopyOnWriteArrayList<>();
        trucks.add(truck1);
        trucks.add(truck2);

        Set<Integer> tiredWorkers = pickTiredWorkers(WORKERS, TIRED_WORKERS);
        System.out.println("Tired workers: " + tiredWorkers);

        ExecutorService executor = Executors.newFixedThreadPool(WORKERS);
        List<Worker> workers = new ArrayList<>();

        // у тебя
        for (int i = 1; i <= WORKERS; i++) {
            boolean tired = tiredWorkers.contains(i);
            Worker worker = new Worker(i, tired);
            workers.add(worker);
            executor.submit(new WorkerRunner(worker, trucks));
        }

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.HOURS);

        Worker best = workers.stream()
                .max(Comparator.comparingInt(Worker::getUnloadedBags))
                .orElseThrow();//вот здесь можно бросить свое исключение с понятным сообщением

        System.out.println("\nWinner: Worker " + best.getId() +
                " unloaded " + best.getUnloadedBags() + " bags and receives burger!");
    }

    private static Set<Integer> pickTiredWorkers(int total, int tiredCount) {
        Random random = new Random();

        Set<Integer> workers = new HashSet<>();
        for (int i = 0; i < total; i++) {
            workers.add(i);
        }

        /*
        Вот здесь есть проблема. В tiredWorkers ты добавляешь результат
        random.nextInt(workers.size());
        А должен workers.get(tiredWorker);
        Если random.nextInt(workers.size()); дважды (или х3) вернет одинаковое знаечение, то в tiredWorkers
        будет меньше уставших работников, чем ты хочешь.
         */
        Set<Integer> tiredWorkers = new HashSet<>();
        for (int i = 0; i < tiredCount; i++) {
            int tiredWorker = random.nextInt(workers.size()); // tiredWorker -> tiredWorkerIndex
            tiredWorkers.add(tiredWorker);
            workers.remove(tiredWorker);
        }
        return tiredWorkers;
    }
}