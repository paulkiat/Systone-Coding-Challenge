package com.example.conversion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InputHandlerTest {

    private final InputHandler inputHandler = new InputHandler();

    @Test
    public void testHandleInputCorrect() {
        // Test cases where the student's response is correct
        assertEquals("Correct", inputHandler.handleInput(0, "Celsius", "Kelvin", 273.15));
        assertEquals("Correct", inputHandler.handleInput(1, "liters", "tablespoons", 67.6));  // Adjusting for rounding
    }

    @Test
    public void testHandleInputIncorrect() {
        // Test cases where the student's response is incorrect
        assertEquals("Incorrect", inputHandler.handleInput(0, "Celsius", "Kelvin", 273.0));
        assertEquals("Incorrect", inputHandler.handleInput(1, "liters", "tablespoons", 67.5)); // Adjusting for rounding
    }

    @Test
    public void testHandleInputInvalid() {
        // Test cases where the input units are invalid
        assertEquals("Invalid", inputHandler.handleInput(0, "Celsius", "gallons", 273.15));
        assertEquals("Invalid", inputHandler.handleInput(1, "dogs", "tablespoons", 67.6));
    }
}
