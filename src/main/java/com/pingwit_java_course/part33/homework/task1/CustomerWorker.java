package com.pingwit_java_course.part33.homework.task1;

import java.util.List;

public class CustomerWorker implements Runnable {
    private final int id;
    private final TicketOfficeService office;
    private final List<BookingResponse> results;

    public CustomerWorker(int id, TicketOfficeService office, List<BookingResponse> results) {
        this.id = id;
        this.office = office;
        this.results = results;
    }

    @Override
    public void run() {
        BookingResponse response = office.tryBuyTicket(id);
        synchronized (results) {
            results.add(response);
        }
    }
}