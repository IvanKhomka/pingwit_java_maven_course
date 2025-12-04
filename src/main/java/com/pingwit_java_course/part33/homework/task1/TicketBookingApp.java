package com.pingwit_java_course.part33.homework.task1;

import java.util.ArrayList;
import java.util.List;

public class TicketBookingApp {

    private static final int TOTAL_TICKETS = 10_000;
    private static final int TOTAL_CUSTOMERS = 15_000;

    public static void main(String[] args) {

        TicketOfficeService office = new TicketOfficeService(TOTAL_TICKETS);

        List<BookingResponse> results = new ArrayList<>(TOTAL_CUSTOMERS);

        Thread[] customers = new Thread[TOTAL_CUSTOMERS];
        long begin = System.currentTimeMillis();

        for (int i = 0; i < TOTAL_CUSTOMERS; i++) {
            customers[i] = new Thread(new CustomerWorker(i + 1, office, results));
            customers[i].start();
        }

        for (Thread t : customers) {
            try {
                t.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        long end = System.currentTimeMillis();

        int successCount = 0;
        int failedCount = 0;

        for (BookingResponse r : results) {
            if (r.isSuccess()) {
                successCount++;
            } else {
                failedCount++;
            }
        }

        System.out.println("Sale ended!");
        System.out.println("Tickets left: " + office.getTicketsLeft());
        System.out.println("Successful purchases: " + successCount);
        System.out.println("Failed purchases: " + failedCount);
        System.out.println("Total time taken: " + (end - begin) + " ms");
    }
}