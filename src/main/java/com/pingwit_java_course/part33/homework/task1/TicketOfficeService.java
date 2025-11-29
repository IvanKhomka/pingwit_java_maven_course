package com.pingwit_java_course.part33.homework.task1;

import java.util.concurrent.locks.ReentrantLock;

public class TicketOfficeService {

    private int ticketsLeft;
    private final ReentrantLock lock = new ReentrantLock();//final поля лучше располагать первыми в классе, выше только static+final

    public TicketOfficeService(int totalTickets) {
        this.ticketsLeft = totalTickets;
    }

    public int getTicketsLeft() {
        lock.lock();
        try {
            return ticketsLeft;
        } finally {
            lock.unlock();
        }
    }

    public BookingResponse tryBuyTicket(int customerId) {
        lock.lock();
        try {
            if (ticketsLeft > 0) {
                ticketsLeft--;
                return new BookingResponse(customerId, true, 0.0);
            } else {
                return new BookingResponse(customerId, false, 0.05);
            }
        } finally {
            lock.unlock();
        }
    }
}