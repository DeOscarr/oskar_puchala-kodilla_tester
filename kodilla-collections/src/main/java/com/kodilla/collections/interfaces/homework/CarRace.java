package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Mercedes mercedes = new Mercedes(0,50,30);
        RollsRoyce rollsRoyce = new RollsRoyce(0,70,40);
        Bugatti bugatti = new Bugatti(0,90,50);

        doRace(mercedes);
        doRace(rollsRoyce);
        doRace(bugatti);
    }
    public static void doRace(Car car)
    {
        for (int i=0;i<3;i++){
            car.increaseSpeed();
        }

        for (int i=0;i<2;i++){
            car.decreaseSpeed();
        }
        System.out.println("Speed of the car equals: "+car.getSpeed());
    }
}
