package com.pingwit_java_course.part31.homework.task2;

public class ToyStoreMain {
    public static void main(String[] args) throws InterruptedException {
        ToyStore store = new ToyStore();

        Thread supplier1 = new Thread(new ToySupplier(store, "Dream Toys LLC", 1000));
        Thread supplier2 = new Thread(new ToySupplier(store, "Egorka Toys Inc.", 500));

        supplier1.start();
        supplier2.start();

        supplier1.join();
        supplier2.join();

        System.out.println("Toys in a store: " + store.getToys());
        System.out.println("Total toys in a store: " + store.getToys().size());
    }
}