package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mercedes;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Volkswagen;

import java.util.ArrayList;
import java.util.List;

import com.kodilla.collections.arrays.homework.homework.CarUtils;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Opel(80));
        cars.add(new Volkswagen(85));
        Mercedes mercedes = new Mercedes(90);
        cars.add(mercedes);

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }

        cars.remove(2);
        cars.remove(mercedes);

        System.out.println(cars.size());

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }
}
