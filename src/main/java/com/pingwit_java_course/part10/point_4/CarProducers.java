package com.pingwit_java_course.part10.point_4;

public enum CarProducers {
    MAZDA {
        @Override
        String sound() {
            return "Zoom-zoom";
        }
    },
    TESLA {
        @Override
        String sound() {
            return "Tsssss";
        }
    },
    BMW {
        @Override
        String sound() {
            return "Vzuch";
        }
    },
    FIAT {
        @Override
        String sound() {
            return "No sound";
        }
    };

    abstract String sound();

    public void sayHi() {
        System.out.println("Hello");
    }
}
