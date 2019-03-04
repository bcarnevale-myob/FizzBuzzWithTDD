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

    @Test
    public void inputFive_ReturnsBuzz() {
        // Arrange
        int input = 5;
        String expectedValue = "Buzz";
        FizzBuzz fizzBuzz = new FizzBuzz();

        // Act
        String actualValue = fizzBuzz.calculateFizzBuzz(input);

        // Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void inputFifteen_ReturnsFizzBuzz() {
        // Arrange
        int input = 15;
        String expectedValue = "FizzBuzz";
        FizzBuzz fizzBuzz = new FizzBuzz();

        // Act
        String actualValue = fizzBuzz.calculateFizzBuzz(input);

        // Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void inputNine_ReturnsFizz() {
        // Arrange
        int input = 9;
        String expectedValue = "Fizz";
        FizzBuzz fizzBuzz = new FizzBuzz();

        // Act
        String actualValue = fizzBuzz.calculateFizzBuzz(input);

        // Assert
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void inputTen_ReturnsBuzz() {
        // Arrange
        int input = 10;
        String expectedValue = "Buzz";
        FizzBuzz fizzBuzz = new FizzBuzz();

        // Act
        String actualValue = fizzBuzz.calculateFizzBuzz(input);

        // Assert
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void inputThirty_ReturnsFizzBuzz() {
        // Arrange
        int input = 30;
        String expectedValue = "FizzBuzz";
        FizzBuzz fizzBuzz = new FizzBuzz();

        // Act
        String actualValue = fizzBuzz.calculateFizzBuzz(input);

        // Assert
        assertEquals(expectedValue, actualValue);
    }

}
