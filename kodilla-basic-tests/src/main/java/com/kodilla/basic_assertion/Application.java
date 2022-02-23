package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int d = - 8;
        int e = 0;
        int f = 3;
        double delta = 0.001;

        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult, delta);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla licz " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla licz" + a + "i" + b);
        }

        int subtractResult = calculator.subtract(a, b);
        boolean correctSubtract = ResultChecker.assertEquals(-3, subtractResult, delta);
        if (correctSubtract) {
            System.out.println("Metoda subtract działa poprawnie dla licz " + a + " i " + b);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla licz " + a + " i " + b);
        }

        int squareResult = calculator.square(a);
        boolean correctSquare = ResultChecker.assertEquals(25, squareResult, 0.001);
        if (correctSquare) {
            System.out.println("Metoda square działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda square nie działa poprawnie dla liczby " + a);
        }

        int squareNumberLessThanZeroResult = calculator.square(d);
        boolean correctSquareNumberLessThanZero = ResultChecker.assertEquals(64, squareNumberLessThanZeroResult, 0.001);
        if (correctSquareNumberLessThanZero) {
            System.out.println("Metoda squareNumberLessThanZero działa poprawnie dla liczby " + d);
        }else {
            System.out.println("Metoda squareNumberLessThanZero nie działa poprawnie dla liczby " + d);
        }

        int squareNumberEqualToZeroResult = calculator.square(e);
        boolean correctSquareNumberEqualToZero = ResultChecker.assertEquals(0, squareNumberEqualToZeroResult, 0.001);
        if (correctSquareNumberEqualToZero) {
            System.out.println("Metoda squareNumberEqualToZero działa poprawnie dla liczby " + e);
        }else {
            System.out.println("Metoda squareNumberEqualToZero nie działa poprawnie dla liczby" + e);
        }

        int squareNumberGreaterThanZeroResult = calculator.square(f);
        boolean correctSquareNumberGreaterThanZero = ResultChecker.assertEquals(9, squareNumberGreaterThanZeroResult, 0.001);
        if (correctSquareNumberGreaterThanZero) {
            System.out.println("Metoda squareNumberGreaterThanZero działa poprawnie dla liczby" + f);
        }else {
            System.out.println("Metoda squareNumberGreaterThanZero nie działa poprawnie dla liczby" + f);
        }
    }
}