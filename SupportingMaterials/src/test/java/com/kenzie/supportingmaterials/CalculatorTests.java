package com.kenzie.supportingmaterials;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTests {

    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
        int input1= 1;
        int input2= 2;

        int expectedOutput = 3;

        int actualOutput = calculator.add(input1, input2);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testSubtract() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.subtract(6, 3);
        int expectedResult = 3;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testMultiply() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.multiply(2,3);
        int expectedResult = 6;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testDivide() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.divide(6, 3);
        int expectedResult = 2;

        assertEquals(expectedResult, actualResult);
    }
}