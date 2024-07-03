package com.example.conversion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InputHandlerTest {

    // Create an instance of InputHandler to use in the tests
    private final InputHandler inputHandler = new InputHandler();

    @Test
    public void testHandleInputCorrect() {
        // Test cases where the student's response is correct

        // Case 1: Convert 0 Celsius to Kelvin, student response is 273.15, expected "Correct"
        assertEquals("Correct", inputHandler.handleInput(0, "Celsius", "Kelvin", 273.15));

        // Case 2: Convert 1 liter to tablespoons, student response is 67.6 (adjusted for rounding), expected "Correct"
        assertEquals("Correct", inputHandler.handleInput(1, "liters", "tablespoons", 67.6));
    }

    @Test
    public void testHandleInputIncorrect() {
        // Test cases where the student's response is incorrect

        // Case 1: Convert 0 Celsius to Kelvin, student response is 273.0, expected "Incorrect"
        assertEquals("Incorrect", inputHandler.handleInput(0, "Celsius", "Kelvin", 273.0));

        // Case 2: Convert 1 liter to tablespoons, student response is 67.5 (adjusted for rounding), expected "Incorrect"
        assertEquals("Incorrect", inputHandler.handleInput(1, "liters", "tablespoons", 67.5));
    }

    @Test
    public void testHandleInputInvalid() {
        // Test cases where the input units are invalid

        // Case 1: Convert 0 Celsius to gallons, student response is 273.15, expected "Invalid"
        assertEquals("Invalid", inputHandler.handleInput(0, "Celsius", "gallons", 273.15));

        // Case 2: Convert 1 "dog" (invalid unit) to tablespoons, student response is 67.6, expected "Invalid"
        assertEquals("Invalid", inputHandler.handleInput(1, "dogs", "tablespoons", 67.6));
    }
}
