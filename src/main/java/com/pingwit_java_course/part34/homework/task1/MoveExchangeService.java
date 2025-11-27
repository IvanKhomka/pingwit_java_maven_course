package com.pingwit_java_course.part34.homework.task1;

import java.util.concurrent.Exchanger;

public class MoveExchangeService {

    private final Exchanger<RpsMove> moveExchanger = new Exchanger<>();

    public Exchanger<RpsMove> getMoveExchanger() {
        return moveExchanger;
    }
}