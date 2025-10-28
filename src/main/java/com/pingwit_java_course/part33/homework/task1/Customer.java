package com.pingwit_java_course.part33.homework.task1;

public class Customer implements Runnable {
    private final int id;
    private final TicketOffice office;

    public Customer(int id, TicketOffice office) {
        this.id = id;
        this.office = office;
    }

    @Override
    public void run() {
        office.tryBuyTicket(id);
    }
}