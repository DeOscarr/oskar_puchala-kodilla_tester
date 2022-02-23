package com.kodilla.inheritance.homework;

public class OperatingSystem
{
    private final int year;

    public OperatingSystem(int year)
    {
        this.year = year;
    }

    public void turnOnSystem()
    {
        System.out.println("System was turned on.");
    }
    public void turnOffSystem()
    {
        System.out.println("System was turned off.");
    }

    public int getYear()
    {
        return year;
    }
}