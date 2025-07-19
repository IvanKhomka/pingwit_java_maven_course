package com.pingwit_java_course.part11.homework.task2;

public class SmartMonkey extends Monkey {
    @Override
    public int countFruits(Tree branch) {
        int count = 0;
        for (FruitType fruit : branch.getFruits()) {
            if (fruit != null) {
                count++;
            }
        }
        for (Tree child : branch.getChildren()) {
            if (child != null) {
                count += countFruits(child);
            }
        }
        return count;
    }
}

