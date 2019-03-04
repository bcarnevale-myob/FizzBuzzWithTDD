package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void inputOne_ReturnOne() {
        // Arrange
        int input = 1;
        String expectedValue = "1";
        FizzBuzz fizzBuzz = new FizzBuzz();

        // Act
        String actualValue = fizzBuzz.calculateFizzBuzz(input);

        // Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void inputTwo_ReturnTwo() {
        // Arrange
        int input = 2;
        String expectedValue = "2";
        FizzBuzz fizzBuzz = new FizzBuzz();

        // Act
        String actualValue = fizzBuzz.calculateFizzBuzz(input);

        // Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void inputThree_ReturnFizz() {
        // Arrange
        int input = 3;
        String expectedValue = "Fizz";
        FizzBuzz fizzBuzz = new FizzBuzz();

        // Act
        String actualValue = fizzBuzz.calculateFizzBuzz(input);

        // Assert
        assertEquals(expectedValue, actualValue);
    }
}
