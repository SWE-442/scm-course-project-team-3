package com.mycompany.calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd() {
        double result = Calculator.add(5, 3);
        assertEquals(8, result);
    }

    @Test
    public void testSubtract() {
        double result = Calculator.subtract(5, 3);
        assertEquals(2, result);
    }

    @Test
    public void testMultiply() {
        double result = Calculator.multiply(5, 3);
        assertEquals(15, result);
    }

    @Test
    public void testDivide() {
        double result = Calculator.divide(10, 5);
        assertEquals(2, result);
    }

    @Test
    public void testDivideByZero() {
        double result = Calculator.divide(10, 0);
        assertEquals(Double.POSITIVE_INFINITY, result);
    }
}
