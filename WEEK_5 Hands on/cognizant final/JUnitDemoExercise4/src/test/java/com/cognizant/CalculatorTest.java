package com.cognizant;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        System.out.println("Setup Method");
        calculator = new Calculator();
    }

    @After
    public void tearDown() {
        System.out.println("Teardown Method");
        calculator = null;
    }

    @Test
    public void testAddition() {

        // Arrange
        int a = 20;
        int b = 10;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(30, result);
    }

    @Test
    public void testSubtraction() {

        // Arrange
        int a = 20;
        int b = 5;

        // Act
        int result = calculator.subtract(a, b);

        // Assert
        assertEquals(15, result);
    }
}