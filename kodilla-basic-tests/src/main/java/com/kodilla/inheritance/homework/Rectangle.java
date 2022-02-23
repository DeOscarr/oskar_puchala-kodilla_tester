package com.kodilla.inheritance.homework;

public class Rectangle extends Shape{

    public double a, b;

    public double SurfaceArea() {
        return a*b;
    }

    public double Perimeter() {
        return 2*a + 2*b;
    }
}