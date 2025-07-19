package com.pingwit_java_course.part24.homework.task4;

import java.util.HashMap;
import java.util.Map;

public class FlowerShop {
    private final Map<Integer, Product> catalog = new HashMap<>();

    public FlowerShop() {
        catalog.put(1, new Product(1, "Ромашки", 500.0, true));
        catalog.put(2, new Product(2, "Розы", 1000.0, true));
        catalog.put(3, new Product(3, "Тюльпаны", 700.0, true));
    }

    public void showCatalog() {
        System.out.println("\nДобрый день! У нас самые свежие цветы:");
        catalog.values().forEach(System.out::println);
    }

    public Product getProductById(int id) {
        return catalog.get(id);
    }

    public boolean isValidProductId(int id) {
        return catalog.containsKey(id) && catalog.get(id).isAvailable();
    }
}