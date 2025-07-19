package com.pingwit_java_course.part11.homework.task2;

public class BananaMonkey extends Monkey {
    @Override
    public int countFruits(Tree branch) {
        return countFruitsByType(branch, FruitType.BANANA);
    }
}

