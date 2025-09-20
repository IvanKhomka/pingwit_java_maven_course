package com.pingwit_java_course.part32.homework.task1;

import java.util.*;

//Давай попробуем эту задачу решить через ExecutorService, он должен хорошо подойти
public class CementUnload {
    static final int WORKERS = 5; //private
    static final int MAX_WORKERS_PER_TRUCK = 3; //private

    public static void main(String[] args) throws InterruptedException {
        Truck truck1 = new Truck("Truck 1", 30, MAX_WORKERS_PER_TRUCK);
        Truck truck2 = new Truck("Truck 2", 30, MAX_WORKERS_PER_TRUCK);
        List<Truck> trucks = Arrays.asList(truck1, truck2); // Arrays.asList() -> List.of() чуть более современный подход

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

    static List<Integer> pickTiredWorkers(int total, int tiredCount) { //private
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= total; i++) list.add(i);
        Collections.shuffle(list);
        return list.subList(0, tiredCount);
    }
}