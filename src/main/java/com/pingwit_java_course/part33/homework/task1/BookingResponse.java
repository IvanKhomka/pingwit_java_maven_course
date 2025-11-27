package com.pingwit_java_course.part33.homework.task1;

public class BookingResponse {
    private final int customerId;
    private final boolean success;
    private final double nextPurchaseDiscount;

    public BookingResponse(int customerId, boolean success, double nextPurchaseDiscount) {
        this.customerId = customerId;
        this.success = success;
        this.nextPurchaseDiscount = nextPurchaseDiscount;
    }

    public int getCustomerId() {
        return customerId;
    }

    public boolean isSuccess() {
        return success;
    }

    public double getNextPurchaseDiscount() {
        return nextPurchaseDiscount;
    }
}