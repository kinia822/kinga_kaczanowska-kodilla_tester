package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mercedes;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Volkswagen;

import java.util.Random;

public class CarApplication {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];
        for (int n = 0; n < cars.length; n ++ )
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar(){
        Random random = new Random();
        int drawnCarType = random.nextInt(3);
        int v = getRandomSpeed(random);
        if (drawnCarType == 0)
            return new Mercedes(v);
        else if (drawnCarType == 1)
            return new Opel(v);
        else
            return new Volkswagen(v);
    }
    private static int getRandomSpeed(Random random){
        return RANDOM.nextInt(151);
    }
}