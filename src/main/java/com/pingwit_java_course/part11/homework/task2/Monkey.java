package com.pingwit_java_course.part11.homework.task2;

public abstract class Monkey {
    public abstract int countFruits(Tree branch);

    protected int countFruitsByType(Tree branch, FruitType type) {
        int count = 0;
        for (FruitType fruit : branch.getFruits()) {
            if (type == fruit) {
                count++;
            }
        }
        for (Tree child : branch.getChildren()) {
            if (child != null) {
                count += countFruitsByType(child, type);
            }
        }
        return count;
    }
}

