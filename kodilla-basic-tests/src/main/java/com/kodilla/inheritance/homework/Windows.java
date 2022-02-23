package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem{
    public Windows(int year) {
        super(year);
    }

    public void openApplication() {
        System.out.println("Opening application...");
    }

    public void closeApplication() {
        System.out.println("Closing application...");
    }

    @Override
    public void turnOnSystem() {
        System.out.println("Windows system was turned on.");
    }
}