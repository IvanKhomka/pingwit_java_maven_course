package com.pingwit_java_course.part41.homework.task3;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record Stock(int id, String ticker, String companyName, String location, BigDecimal lastPrice,
                    LocalDateTime updateDateTime) {
}