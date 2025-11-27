package com.pingwit_java_course.part34.homework.task1;

public class GameEngine {
    private final MoveExchangeService moveExchangeService = new MoveExchangeService();
    private final RpsRulesEngine rulesEngine = new RpsRulesEngine();

    public void runGameRound() {

        var exchanger = moveExchangeService.getMoveExchanger();

        PlayerWorker firstPlayer = new PlayerWorker("Player-Egorka", exchanger);
        PlayerWorker secondPlayer = new PlayerWorker("Player-Ivan", exchanger);

        Thread firstPlayerThread = new Thread(firstPlayer, "thread-player-alpha");
        Thread secondPlayerThread = new Thread(secondPlayer, "thread-player-bravo");

        firstPlayerThread.start();
        secondPlayerThread.start();

        try {
            firstPlayerThread.join();
            secondPlayerThread.join();

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\n>>> The round is over - moves were exchanged via Exchanger <<<");
    }
}