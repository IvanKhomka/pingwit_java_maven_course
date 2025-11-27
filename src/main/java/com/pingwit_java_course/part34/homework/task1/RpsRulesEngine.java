package com.pingwit_java_course.part34.homework.task1;

public class RpsRulesEngine {

    public RoundOutcome evaluate(RpsMove firstPlayerMove, RpsMove secondPlayerMove) {

        if (firstPlayerMove == secondPlayerMove) {
            return RoundOutcome.DRAW;
        }

        switch (firstPlayerMove) {
            case ROCK:
                return (secondPlayerMove == RpsMove.SCISSORS)
                        ? RoundOutcome.FIRST_PLAYER_WINS
                        : RoundOutcome.SECOND_PLAYER_WINS;

            case PAPER:
                return (secondPlayerMove == RpsMove.ROCK)
                        ? RoundOutcome.FIRST_PLAYER_WINS
                        : RoundOutcome.SECOND_PLAYER_WINS;

            case SCISSORS:
                return (secondPlayerMove == RpsMove.PAPER)
                        ? RoundOutcome.FIRST_PLAYER_WINS
                        : RoundOutcome.SECOND_PLAYER_WINS;

            default:
                throw new IllegalStateException("Unexpected move: " + firstPlayerMove);
        }
    }
}