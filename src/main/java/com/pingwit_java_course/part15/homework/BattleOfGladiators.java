package com.pingwit_java_course.part15.homework;

import java.util.Random;
import java.util.Scanner;

public class BattleOfGladiators {

    private static final int DEFAULT_HP = 4;
    private static final int MIN_ATTACK = 1;
    private static final int MAX_ATTACK = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter your gladiator's name: ");
        String playerName = scanner.nextLine();

        String[] opponents = {"Ibrahim", "Avram", "Agnes"};
        String opponentName = opponents[random.nextInt(opponents.length)];

        Player player = new Player(playerName, DEFAULT_HP);
        Player opponent = new Player(opponentName, DEFAULT_HP);

        FightService fightService = new FightService(random);

        System.out.println("The battle between: " + player.getName() + " and " + opponent.getName() + " begins!");
        System.out.println("Are you ready? Press Enter to begin the battle.");
        scanner.nextLine();

        while (player.isAlive() && opponent.isAlive()) {
            try {
                System.out.println("Choose an attack: 1 - Head kick, 2 - Body kick, 3 - Leg kick");
                int playerAttack = getValidatedInput(scanner);
                int opponentBlock = fightService.generateRandomMove(MAX_ATTACK);

                if (fightService.attackHits(playerAttack, opponentBlock)) {
                    opponent.decreaseHP();
                    System.out.println("Your strike has reached its target! Enemy health: " + opponent.getHp());
                } else {
                    System.out.println("The enemy successfully blocked your strike.");
                }

                if (!opponent.isAlive()) {
                    break;
                }

                int opponentAttack = fightService.generateRandomMove(MAX_ATTACK);
                System.out.println("The enemy is attacking! Select defense: 1 - Upper block, 2 - Middle block, 3 - Lower block");
                int playerBlock = getValidatedInput(scanner);

                if (fightService.attackHits(opponentAttack, playerBlock)) {
                    player.decreaseHP();
                    System.out.println("You missed a hit! Your health: " + player.getHp());
                } else {
                    System.out.println("You successfully blocked an enemy strike.");
                }

            } catch (WrongCommandException e) {
                System.out.println(e.getMessage());
            }
        }

        if (player.isAlive()) {
            System.out.println("You have won! The enemy is defeated.");
        } else {
            System.out.println("You lost. The enemy won!");
        }
    }

    private static int getValidatedInput(Scanner scanner) throws WrongCommandException {
        int input;
        if (scanner.hasNextInt()) {
            input = scanner.nextInt();
            if (input < MIN_ATTACK || input > MAX_ATTACK) {
                throw new WrongCommandException("Wrong command. Try again.");
            }
        } else {
            scanner.next();
            throw new WrongCommandException("Invalid input. Enter a number between 1 and 3.");
        }
        return input;
    }
}