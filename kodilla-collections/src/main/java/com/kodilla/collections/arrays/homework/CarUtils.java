package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Bugatti;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mercedes;
import com.kodilla.collections.interfaces.homework.RollsRoyce;

public class CarUtils {
    public static void describeCar(Car car){
        System.out.println("-----------------------------");
        System.out.println("Car brand: "+getBrand(car));
        System.out.println("Initial speed: 0");
        System.out.println("Current speed: "+car.getSpeed());
    }
    public static String getBrand(Car car){
        if (car instanceof Mercedes)
            return "Mercedes.";
        else if(car instanceof RollsRoyce){
            return "Rolls Royce.";}
        else if (car instanceof Bugatti){
            return "Bugatti.";}
        else
            return "Unknown car brand.";
            }
        }
