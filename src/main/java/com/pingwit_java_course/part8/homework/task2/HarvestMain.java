package com.pingwit_java_course.part8.homework.task2;

import java.math.BigDecimal;
import java.util.Arrays;

public class HarvestMain {
    public static void main(String[] args) {
        Harvest[] harvests = {
                new Harvest(121L,"First Field","Carrot", BigDecimal.valueOf(213.14)),
                new Harvest(122L,"Second Field","Potato", BigDecimal.valueOf(220.14)),
                new Harvest(123L,"Third Field","Tomato", BigDecimal.valueOf(123.14)),
                new Harvest(124L,"Fourth Field","Potato", BigDecimal.valueOf(321.14)),
                new Harvest(125L,"Fifth Field","Onion", BigDecimal.valueOf(156.14)),
                new Harvest(126L,"Sixth Field","Cucumber", BigDecimal.valueOf(265.14)),
        };
        HarvestStatisticService harvestStatisticService = new HarvestStatisticService();
        HarvestStatistic[] statistics = harvestStatisticService.calculate(harvests);
        System.out.println("Harvest Statistics:");
        for (HarvestStatistic stat : statistics) {
            System.out.println(stat);
        }
    }
}
