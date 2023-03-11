package com.kenzie.supportingmaterials;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalculatorTest {

    @Test
    void testAddition() {
        // Input Data - the data I'm going to send to my code
        int numberOne = 9;
        int numberTwo = 8;
        Calculator calculator = new Calculator();

        // Expected Output - The correct answer
        int expectedOutput = 17;

        // Call the code
        // Actual Output - Save what the code produced
        int actualOutput = calculator.add(numberOne, numberTwo);

        // Assert actual equals expected - check the actual answer is correct
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testSubtraction() {
        Calculator calculator = new Calculator();
        int expectedResult = calculator.subtract(9, 3);
        int actualResult = 6;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testMultiplication() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.multiply(6, 3);
        int expectedResult = 18;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testDivision() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.divide(144, 12);
        int expectedResult = 12;

        assertEquals(expectedResult, actualResult);
    }

}