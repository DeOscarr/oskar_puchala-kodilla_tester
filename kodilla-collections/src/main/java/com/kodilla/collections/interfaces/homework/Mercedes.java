package com.kodilla.collections.interfaces.homework;

public class Mercedes implements Car{

    private int speed;
    private int acceleration;
    private int braking;

    public Mercedes(int speed, int acceleration, int braking){
        this.speed=speed;
        this.acceleration=acceleration;
        this.braking=braking;
    }
    public Mercedes(int speed){
        this.speed=speed;
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }
    @Override
    public void increaseSpeed() {
        this.speed=speed+acceleration;
    }

    @Override
    public void decreaseSpeed() {
        this.speed=speed-braking;
    }
}
