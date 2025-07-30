package com.pingwit_java_course.part29.homework.task1;

import com.fasterxml.jackson.annotation.JsonProperty;

record Atm(
        Integer id,
        String area,
        @JsonProperty("city_type") String cityType, // String cityType с новой строки обычно делают, тоже самое для всех других полей
        String city,
        @JsonProperty("address_type") String addressType,
        String address,
        String house,
        @JsonProperty("work_time") String workTime,
        @JsonProperty("ATM_type") String atmType,
        @JsonProperty("cash_in") String cashIn
) {
}