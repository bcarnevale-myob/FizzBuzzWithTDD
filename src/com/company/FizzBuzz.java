package com.company;

public class FizzBuzz {
    public String calculateFizzBuzz(int input) {
        if (input % 3 == 0) {
            return "Fizz";
        } else if (input == 5) {
            return "Buzz";
        } else if (input % 5 == 0 && input % 3 == 0) {
            return "FizzBuzz";
        }
        return Integer.toString(input);
    }
}
