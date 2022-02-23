package com.kodilla.inheritance.homework;

public class Square extends Shape {

    double a;
    public double SurfaceArea() {
        return a*a;
    }

    public double Perimeter() {
        return 4*a;
    }
}