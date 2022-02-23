package com.kodilla.inheritance.homework;

public class Result
{
    public static void main(String[] args)
    {
        OperatingSystem operatingSystem = new OperatingSystem(2022);
        operatingSystem.turnOnSystem();
        System.out.println("Year of it's production: "+operatingSystem.getYear());
        operatingSystem.turnOffSystem();

        Windows windows = new Windows(1985);
        windows.turnOnSystem();
        System.out.println("Year of it's production: "+windows.getYear());
        windows.turnOffSystem();

        Linux linux = new Linux(1991);
        linux.turnOnSystem();
        System.out.println("Year of it's production: "+linux.getYear());
        linux.turnOffSystem();
    }
}