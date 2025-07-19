package com.pingwit_java_course.part14.homework.task6;

import java.util.Arrays;

public class EngineMarking {
    private static final String ENGINE_VOLUME_1_4 = "1.4";
    private static final String ENGINE_VOLUME_1_8 = "1.8";
    private static final String ENGINE_VOLUME_2_0_TURBO = "2.0T";
    private static final String ENGINE_VOLUME_1_8_TURBO = "1.8T";

    public static void main(String[] args) {
        String[] engines = {
                "1.4", "1.6", "1.8", "1.4", "1.8",
                "1.4", "2.2", "1.4", "1.8", "2.7"
        };

        for (int i = 0; i < engines.length; i++) {
            if (ENGINE_VOLUME_1_4.equals(engines[i])) {
                engines[i] = ENGINE_VOLUME_2_0_TURBO;
            } else if (ENGINE_VOLUME_1_8.equals(engines[i])) {
                engines[i] = ENGINE_VOLUME_1_8_TURBO;
            }
        }
        System.out.println("Changed markings: " + Arrays.toString(engines));
    }
}