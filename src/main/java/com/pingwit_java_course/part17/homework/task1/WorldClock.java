package com.pingwit_java_course.part17.homework.task1;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.DateTimeException;
import java.util.Scanner;

public class WorldClock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a time zone (e.g., Europe/Warsaw): ");
        String zoneIdString = scanner.nextLine().trim();

        try {
            ZoneId zoneId = ZoneId.of(zoneIdString);
            ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy HH:mm:ss");
            System.out.println("Local date and time in " + zoneIdString + ": " + zonedDateTime.format(formatter));
        } catch (DateTimeException e) {
            System.out.println("Invalid time zone. Please try again. Example: Europe/Warsaw");
        }

        scanner.close();
    }
}