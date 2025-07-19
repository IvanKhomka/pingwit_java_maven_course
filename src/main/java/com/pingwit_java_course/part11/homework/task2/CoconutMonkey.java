package com.pingwit_java_course.part11.homework.task2;

public class CoconutMonkey extends Monkey {
    @Override
    public int countFruits(Tree branch) {
        return countFruitsByType(branch, FruitType.COCONUT);
    }
}

