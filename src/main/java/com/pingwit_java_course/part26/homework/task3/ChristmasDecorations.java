package com.pingwit_java_course.part26.homework.task3;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ChristmasDecorations {
    public static void main(String[] args) {
        List<ChristmasToy> toys = List.of(
                new ChristmasToy("Шар", true),
                new ChristmasToy("Звезда", false),
                new ChristmasToy("Сосулька", true),
                new ChristmasToy("Фигурка", false)
        );

        Map<Boolean, List<ChristmasToy>> groupedToys = toys.stream()
                .collect(Collectors.partitioningBy(ChristmasToy::hasHook));

        System.out.println("С крепежом: " + groupedToys.get(true));
        System.out.println("Без крепежа: " + groupedToys.get(false));
    }
}