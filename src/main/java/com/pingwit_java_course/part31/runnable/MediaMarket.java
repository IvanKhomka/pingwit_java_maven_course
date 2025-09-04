package com.pingwit_java_course.part31.runnable;

import java.util.List;

record MediaMarket(List<Agd> electronics) {

    void add(Agd item) {
        this.electronics().add(item);
    }
}
