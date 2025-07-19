package com.pingwit_java_course.part22.homework.task1;

import java.util.HashSet;
import java.util.Set;

public class ShopMain {
    public static void main(String[] args) {
        Set<Shop> shopSet = new HashSet<>();

        Shop firstShop = new Shop(1, "Grocery Store");
        Shop secondShop = new Shop(1, "Grocery Store");
        Shop thirdShop = new Shop(1, "Grocery Store");

        shopSet.add(firstShop);
        shopSet.add(secondShop);
        shopSet.add(thirdShop);

        System.out.println("Shops in Set:");
        for (Shop shop : shopSet) {
            System.out.println(shop);
        }
    }
}