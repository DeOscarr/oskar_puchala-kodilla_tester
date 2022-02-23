package com.kodilla.inheritance.homework;

public class Application {
    public static void main(String[] args) {

        Square square = new Square();
        square.a = 10;
        System.out.println("Pole kwadratu =" + square.SurfaceArea());
        System.out.println("Obwód kwadratu = " + square.Perimeter());

        Rectangle rectangle = new Rectangle();
        rectangle.a = 5;
        rectangle.b = 2;
        System.out.println("Pole prostokąta = " + rectangle.SurfaceArea());
        System.out.println("Obwód prostokąta =" + rectangle.Perimeter());

        Triangle triangle = new Triangle();
        triangle.a = 29;
        triangle.b = 40;
        triangle.c = 29;
        triangle.h = 21;
        System.out.println("Pole trójkąta =" + triangle.SurfaceArea());
        System.out.println("Obwód trójkąta =" + triangle.Perimeter());
    }
}