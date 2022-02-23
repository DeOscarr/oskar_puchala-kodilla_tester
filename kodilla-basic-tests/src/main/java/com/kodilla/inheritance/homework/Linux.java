package com.kodilla.inheritance.homework;

public class Linux extends OperatingSystem{
    public Linux(int year) {
        super(year);
    }

    public void openFolder() {
        System.out.println("Opening folder...");
    }

    public void closeFolder() {
        System.out.println("Closing folder...");
    }

    @Override
    public void turnOnSystem() {
        System.out.println("Linux system was turned on.");
    }
}