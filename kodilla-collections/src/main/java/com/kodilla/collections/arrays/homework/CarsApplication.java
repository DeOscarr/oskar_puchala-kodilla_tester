package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Bugatti;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mercedes;
import com.kodilla.collections.interfaces.homework.RollsRoyce;

import java.util.Random;

public class CarsApplication {

    public static void main(String[] args) {

        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = drawCar();
        }
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }

    public static Car drawCar() {
        Random random = new Random();
        int drawCarType = random.nextInt(3);
        int speed = random.nextInt(100);

        if (drawCarType == 0) {
            return new Mercedes(speed);
        } else if (drawCarType == 1) {
            return new RollsRoyce(speed);
        } else {
            return new Bugatti(speed);
        }
    }
}
