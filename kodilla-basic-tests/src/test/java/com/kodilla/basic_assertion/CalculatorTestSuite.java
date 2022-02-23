package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subtractResult = calculator.subtract(a, b);
        assertEquals(-3, subtractResult);
    }

    @Test
    public void testSquare() {
        Calculator calculator = new Calculator();
        int a = 5;
        int squareResult = calculator.square(a);
        assertEquals(25, squareResult);
    }

    @Test
    public void testSquareNumberLessThanZero() {
        Calculator calculator = new Calculator();
        int d = -8;
        double delta = 0.001;
        int squareNumberLessThanZeroResult = calculator.square(d);
        assertEquals(64, squareNumberLessThanZeroResult, 0.001);
    }

    @Test
    public void testSquareNumberEqualToZero() {
        Calculator calculator = new Calculator();
        int e = 0;
        double delta = 0.001;
        int squareNumberEqualToZeroResult = calculator.square(e);
        assertEquals(0, squareNumberEqualToZeroResult, 0.001);
    }

    @Test
    public void testSquareNumberGreaterThanZero() {
        Calculator calculator = new Calculator();
        int f = 3;
        double delta = 0.001;
        int squareNumberGreaterThanZeroResult = calculator.square(f);
        assertEquals(9, squareNumberGreaterThanZeroResult, 0.001);
    }

}
