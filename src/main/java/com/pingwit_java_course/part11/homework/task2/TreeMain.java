package com.pingwit_java_course.part11.homework.task2;

public class TreeMain {
    public static void main(String[] args) {

        Tree branch1 = new Tree(
                new FruitType[] {FruitType.BANANA},
                new Tree[0]
        );

        Tree branch2 = new Tree(
                new FruitType[] {FruitType.COCONUT, FruitType.COCONUT},
                new Tree[0]
        );

        Tree root = new Tree(
                new FruitType[] {FruitType.BANANA, FruitType.COCONUT},
                new Tree[] {branch1, branch2}
        );

        Monkey bananaMonkey = new BananaMonkey();
        Monkey coconutMonkey = new CoconutMonkey();
        Monkey smartMonkey = new SmartMonkey();

        MonkeyManager manager = new MonkeyManager();

        System.out.println("Бананов: " + manager.askMonkeyToCountFruits(bananaMonkey, root));
        System.out.println("Кокосов: " + manager.askMonkeyToCountFruits(coconutMonkey, root));
        System.out.println("Всего фруктов: " + manager.askMonkeyToCountFruits(smartMonkey, root));
    }
}