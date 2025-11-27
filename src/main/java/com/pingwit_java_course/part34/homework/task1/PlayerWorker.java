package com.pingwit_java_course.part34.homework.task1;

import java.util.concurrent.Exchanger;

public class PlayerWorker implements Runnable {

    private final String playerId;
    private final Exchanger<RpsMove> moveExchanger;

    public PlayerWorker(String playerId, Exchanger<RpsMove> moveExchanger) {
        this.playerId = playerId;
        this.moveExchanger = moveExchanger;
    }

    @Override
    public void run() {
        try {
            RpsMove generatedMove = RpsMove.random();
            System.out.println(playerId + " chose: " + generatedMove);

            RpsMove opponentMove = moveExchanger.exchange(generatedMove);

            System.out.println(playerId + " got opponent turn: " + opponentMove);

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}