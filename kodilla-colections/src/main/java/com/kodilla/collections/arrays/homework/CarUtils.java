package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mercedes;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Volkswagen;

public class CarUtils {

    public static void describeCar(Car car) {
        System.out.println("---------------------------");
        System.out.println("Car type: " + getCarType(car));
        System.out.println("Car speed: " + car.getSpeed());
    }

    private static String getCarType(Car car) {
        if (car instanceof Mercedes)
            return "Mercedes";
        else if (car instanceof Opel)
            return "Opel";
        else if (car instanceof Volkswagen)
            return "Volkswagen";
        else
            return "Unknown car type";
    }
}
