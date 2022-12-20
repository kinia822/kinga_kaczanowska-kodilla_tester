package com.kodilla.collections.interfaces.homework;

public class Volkswagen implements Car {

    int speed;

    public Volkswagen(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 45;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 35;
    }
}
