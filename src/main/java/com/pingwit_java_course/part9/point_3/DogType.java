package com.pingwit_java_course.part9.point_3;

public enum DogType {
    MOPS(true),
    BEAGLE (true),
    BASSENJI (false);

    private boolean barking;

    DogType(boolean barking) {
        this.barking = barking;
    }

    public boolean isBarking() {
        return barking;
    }
}
