package com.pingwit_java_course.part22.homework.task2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class VisitorsStorageMain {
    public static void main(String[] args) {
        List<VisitorsStorage> visits = new ArrayList<>();
        visits.add(new VisitorsStorage("Egorka", "pingwit.com", LocalDate.of(2025, 6, 10)));
        visits.add(new VisitorsStorage("Ivan", "yahoo.com", LocalDate.of(2025, 5, 11)));
        visits.add(new VisitorsStorage("Elena", "apple.com", LocalDate.of(2025, 5, 12)));
        visits.add(new VisitorsStorage("Olga", "google.com", LocalDate.of(2025, 6, 16)));
        visits.add(new VisitorsStorage("Alexey", "tesla.com", LocalDate.of(2025, 6, 12)));
        visits.add(new VisitorsStorage("Sasha", "twitter.com", LocalDate.of(2025, 6, 17)));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month in format yyyy-MM: ");
        String month = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM");
        Map<String, Integer> siteToVisitors = new HashMap<>();

        for (VisitorsStorage visit : visits) {
            String visitYearMonth = visit.getDate().format(formatter);
            if (visitYearMonth.equals(month)) {
                siteToVisitors.merge(visit.getWebsiteName(), 1, (oldValue, newValue) -> ++oldValue);
            }
        }

        System.out.println("Visitors of website in month " + month + " are: ");
        for (Map.Entry<String, Integer> entry : siteToVisitors.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " visits");
        }
    }
}