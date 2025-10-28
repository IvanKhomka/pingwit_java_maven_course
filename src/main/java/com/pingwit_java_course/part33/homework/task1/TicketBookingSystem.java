package com.pingwit_java_course.part33.homework.task1;

public class TicketBookingSystem {

    private static final int TOTAL_TICKETS = 10_000;
    private static final int TOTAL_CUSTOMERS = 15_000;

    public static void main(String[] args) {

        TicketOffice office = new TicketOffice(TOTAL_TICKETS);

        Thread[] customers = new Thread[TOTAL_CUSTOMERS];

        for (int i = 0; i < TOTAL_CUSTOMERS; i++) {
            customers[i] = new Thread(new Customer(i + 1, office));
            customers[i].start();
        }

        for (Thread t : customers) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\nSale ended!");
        System.out.println("Tickets left: " + office.getTicketsLeft());
    }
}