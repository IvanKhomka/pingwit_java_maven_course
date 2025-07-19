package com.pingwit_java_course.part15.homework;

public class Player {
    private final String name;
    private int hp;

    public Player(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void decreaseHP() {
        if (hp > 0) {
            hp--;
        }
    }

    public boolean isAlive() {
        return hp > 0;
    }
}