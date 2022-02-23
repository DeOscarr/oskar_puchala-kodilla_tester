package com.kodilla.inheritance;

public class Car {
    private int wheels; /// co to znaczy ze moze byc final?
    private int seats;

    public Car(int wheels, int seats) {
        this.wheels = wheels;
        this.seats = seats;
    }

    public void turnOnLights() {
        System.out.println("Lights were turned on");
    }

    public void openDoors() {
        System.out.println("Opening 4 doors");
    }

    public int getWheels() {
        return wheels;
    }

    public int getSeats() {
        return seats;
    }
    public void displayNumberOfSeats(){
        System.out.println("Number of seats "+seats);
    }
}