package com.pingwit_java_course.part24.homework.task4;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DiscountService {
    private static final double DISCOUNT_PERCENT = 0.10;

    public boolean isEligibleForDiscount(boolean isBirthday) {
        return isBirthday || isMarch8();
    }

    private boolean isMarch8() {
        ZonedDateTime today = ZonedDateTime.now(ZoneId.systemDefault());
        return today.getMonthValue() == 3 && today.getDayOfMonth() == 8;
    }

    public double applyDiscount(double price) {
        return price * (1 - DISCOUNT_PERCENT);
    }
}