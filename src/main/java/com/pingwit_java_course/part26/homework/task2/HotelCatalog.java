package com.pingwit_java_course.part26.homework.task2;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class HotelCatalog {
    public static void main(String[] args) {
        List<Hotel> hotels = List.of(
                new Hotel("World Hostel", 8.5),
                new Hotel("Guitar Hostel", 6.7),
                new Hotel("Radisson Blue", 9.1),
                new Hotel("Radisson Red", 8.8)
        );

        Optional<Hotel> bestHotel = hotels.stream()
                .max(Comparator.comparing(Hotel::rating));
        bestHotel.ifPresent(System.out::println);
    }
}