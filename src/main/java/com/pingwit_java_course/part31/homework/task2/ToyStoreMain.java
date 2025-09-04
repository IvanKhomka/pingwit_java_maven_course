package com.pingwit_java_course.part31.homework.task2;

public class ToyStoreMain {
    public static void main(String[] args) {
        ToyStore store = new ToyStore();

        Thread supplier1 = new Thread(new Supplier(store, "FirstSupplier", 100));
        Thread supplier2 = new Thread(new Supplier(store, "SecondSupplier", 50));

        supplier1.start();
        supplier2.start();

        try {
            supplier1.join();
            supplier2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Toys in a store: " + store.getToys());
    }
}