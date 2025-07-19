package com.pingwit_java_course.part23.homework.task3;

import java.math.BigDecimal;
import java.util.*;

public class FruitWarehouseMain {
    public static void main(String[] args) {
        List<Fruit> fruits = List.of(
                new Fruit("Orange", 10, "Citrus"),
                new Fruit("Mandarin", 5, "Citrus"),
                new Fruit("Mango", 8, "Tropical"),
                new Fruit("Peach", 7, "Stone fruit"),
                new Fruit("Apricot", 4, "Stone fruit"),
                new Fruit("Pineapple", 3, "Tropical")
        );

        Map<String, List<Fruit>> grouped = new HashMap<>();

        for (Fruit fruit : fruits) {
            if (!grouped.containsKey(fruit.getType())) {
                grouped.put(fruit.getType(), new ArrayList<>());
            }
            grouped.get(fruit.getType()).add(fruit);
        }

        for (Map.Entry<String, List<Fruit>> entry : grouped.entrySet()) {
            String type = entry.getKey();
            List<Fruit> commonTypeFruits = entry.getValue();

            BigDecimal totalWeight = BigDecimal.ZERO;
            for (Fruit fruit : commonTypeFruits) {
                totalWeight = totalWeight.add(BigDecimal.valueOf(fruit.getWeight()));
            }

            commonTypeFruits.sort(Comparator.comparing(Fruit::getName));

            System.out.println("\nType: " + type);
            System.out.println("Total weight: " + totalWeight + " kg");
            System.out.println("Fruits: " + commonTypeFruits);
        }
    }
}