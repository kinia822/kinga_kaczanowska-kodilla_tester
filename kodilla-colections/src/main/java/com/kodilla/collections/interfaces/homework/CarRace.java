package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Volkswagen volkswagen = new Volkswagen(78);
        doRace(volkswagen);

        Mercedes mercedes = new Mercedes(80);
        doRace(mercedes);

        Opel opel = new Opel(82);
        doRace(opel);
    }

    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }
}
