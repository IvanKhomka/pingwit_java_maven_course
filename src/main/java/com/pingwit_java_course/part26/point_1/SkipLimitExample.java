package com.pingwit_java_course.part26.point_1;

import com.pingwit_java_course.part25.point_3.entity.Phone;

import java.util.List;

public class SkipLimitExample {
    public static void main(String[] args) {
        List<Phone> phones = List.of(
                new Phone("Xs", "Apple", 200),
                new Phone("8", "Apple", 400),
                new Phone("S10", "Samsung", 250),
                new Phone("S10", "Samsung", 350),
                new Phone("8800", "Nokia", 1000),
                new Phone("3310", "Nokia", 1000),
                new Phone("3310", "Nokia", null)
        );

        List<Phone> sublist = phones.stream()
                .skip(2)
                .limit(20)
                .toList();

        System.out.println(sublist.size());
        System.out.println(sublist);
    }
}
