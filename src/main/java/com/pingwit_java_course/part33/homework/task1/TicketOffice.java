package com.pingwit_java_course.part33.homework.task1;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class TicketOffice {

    private final AtomicInteger ticketsLeft;
    private final ReentrantLock lock = new ReentrantLock();

    public TicketOffice(int totalTickets) {
        this.ticketsLeft = new AtomicInteger(totalTickets);
    }

    public int getTicketsLeft() {
        return ticketsLeft.get();
    }

    //а что если возвращать объект BookingResponse с количеством купленных билетов и полем скидкаДляСледующейПокупки?
    public boolean tryBuyTicket(int customerId) {
        lock.lock();
        try {
            if (ticketsLeft.get() > 0) {
                Thread.sleep((int) (Math.random() * 5));
                ticketsLeft.decrementAndGet();
                System.out.println("Customer #" + customerId + " successfully purchased a ticket. Remaining tickets: " + ticketsLeft.get());
                return true;
            } else {
                System.out.println("Customer #" + customerId + " didn't make it. 5% discount on the next concert!");
                return false;
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return false;
        } finally {
            lock.unlock();
        }
    }
}