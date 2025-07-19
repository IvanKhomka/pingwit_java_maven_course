package com.pingwit_java_course.part9.homework.task1;

public class WarehouseMain {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse(new int[]{10, 20, 30, 40, 60});

        System.out.println(warehouse);
        System.out.println(warehouse.next());
        System.out.println(warehouse.next());
        System.out.println(warehouse.next());
        System.out.println(warehouse.next());
        System.out.println(warehouse.next());
        System.out.println(warehouse.next());
        System.out.println(warehouse.next());
    }
}
