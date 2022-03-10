package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Bugatti;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mercedes;
import com.kodilla.collections.interfaces.homework.RollsRoyce;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {

    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();

        cars.add(new Mercedes(50));
        cars.add(new Bugatti(70));
        RollsRoyce rollsRoyce = new RollsRoyce(60);
        cars.add(rollsRoyce);


         for (Car car : cars){
             CarUtils.describeCar(car);
         }

         cars.remove(0);
         cars.remove(rollsRoyce);

        System.out.println("-----------------------------");
        System.out.println("This is the size of our list after removing two cars: "+cars.size());

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }

    }
}
