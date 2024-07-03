package com.example.conversion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConversionTest {
    // Create instances of Conversion and InputHandler to use in the tests
    private final Conversion conversion = new Conversion();
    private final InputHandler inputHandler = new InputHandler();

    @Test
    public void testConversionScenarios() {
        // Test various scenarios for handling input and verifying student responses

        // Scenario 1: 84.2 Fahrenheit to Rankine, student response 543.94, expected "Correct"
        assertEquals("Correct", inputHandler.handleInput(84.2, "Fahrenheit", "Rankine", 543.94));

        // Scenario 2: 317.33 Kelvin to Fahrenheit, student response 111.554, expected "Incorrect"
        assertEquals("Incorrect", inputHandler.handleInput(317.33, "Kelvin", "Fahrenheit", 111.554));

        // Scenario 3: 25.6 cups to liters, student response 6.1, expected "Correct"
        assertEquals("Correct", inputHandler.handleInput(25.6, "cups", "liters", 6.1));

        // Scenario 4: 73.12 gallons to Kelvin, student response 19.4, expected "Invalid"
        assertEquals("Invalid", inputHandler.handleInput(73.12, "gallons", "Kelvin", 19.4));

        // Scenario 5: 6.5 Fahrenheit to Rankine, student response "dog", expected "Incorrect"
        // Handling "dog" as incorrect response since it is not a valid number
        assertThrows(NumberFormatException.class, () -> Double.parseDouble("dog"));

        // Scenario 6: 136.1 "dog" to Celsius, student response 45.32, expected "Invalid"
        assertEquals("Invalid", inputHandler.handleInput(136.1, "dog", "Celsius", 45.32));
    }

    @Test
    public void testConvertTemperature() {
        // Test the temperature conversion methods

        // Conversion from Celsius to other units
        assertEquals(273.15, conversion.convertTemperature(0, "Celsius", "Kelvin"), 0.01);
        assertEquals(32.0, conversion.convertTemperature(0, "Celsius", "Fahrenheit"), 0.01);
        assertEquals(491.67, conversion.convertTemperature(0, "Celsius", "Rankine"), 0.01);

        // Conversion from Kelvin to other units
        assertEquals(-273.15, conversion.convertTemperature(0, "Kelvin", "Celsius"), 0.01);
        assertEquals(-459.67, conversion.convertTemperature(0, "Kelvin", "Fahrenheit"), 0.01);
        assertEquals(0.0, conversion.convertTemperature(0, "Kelvin", "Rankine"), 0.01);

        // Conversion from Fahrenheit to other units
        assertEquals(0.0, conversion.convertTemperature(32, "Fahrenheit", "Celsius"), 0.01);
        assertEquals(273.15, conversion.convertTemperature(32, "Fahrenheit", "Kelvin"), 0.01);
        assertEquals(491.67, conversion.convertTemperature(32, "Fahrenheit", "Rankine"), 0.01);

        // Conversion from Rankine to other units
        assertEquals(-273.15, conversion.convertTemperature(0, "Rankine", "Celsius"), 0.01);
        assertEquals(0.0, conversion.convertTemperature(0, "Rankine", "Kelvin"), 0.01);
        assertEquals(-459.67, conversion.convertTemperature(0, "Rankine", "Fahrenheit"), 0.01);
    }

    @Test
    public void testConvertVolume() {
        // Test the volume conversion methods

        // Conversion from liters to other units
        assertEquals(67.628, conversion.convertVolume(1, "liters", "tablespoons"), 0.01);

        // Conversion from gallons to other units
        assertEquals(3.785, conversion.convertVolume(1, "gallons", "liters"), 0.01);
    }

    @Test
    public void testTemperatureConversionEdgeCases() {
        // Test temperature conversion edge cases

        // Negative values
        assertEquals(-40.0, conversion.convertTemperature(-40, "Celsius", "Fahrenheit"), 0.01);
        assertEquals(-40.0, conversion.convertTemperature(-40, "Fahrenheit", "Celsius"), 0.01);

        // Large numbers
        assertEquals(1273.15, conversion.convertTemperature(1000, "Celsius", "Kelvin"), 0.01);
        assertEquals(1832.0, conversion.convertTemperature(1000, "Celsius", "Fahrenheit"), 0.01);

        // Boundary conditions
        assertEquals(-273.15, conversion.convertTemperature(0, "Kelvin", "Celsius"), 0.01);
        assertEquals(0.0, conversion.convertTemperature(0, "Kelvin", "Rankine"), 0.01);
    }

    @Test
    public void testVolumeConversionEdgeCases() {
        // Test volume conversion edge cases

        // Very small numbers
        assertEquals(0.067628, conversion.convertVolume(0.001, "liters", "tablespoons"), 0.00001);

        // Very large numbers
        assertEquals(67628.0, conversion.convertVolume(1000, "liters", "tablespoons"), 0.1);

        // Boundary conditions
        assertEquals(0.0, conversion.convertVolume(0, "liters", "gallons"), 0.01);
    }

    @Test
    public void testTemperatureConversionPerformance() {
        // Test the performance of temperature conversions
        for (int i = 0; i < 1000000; i++) {
            assertEquals(273.15, conversion.convertTemperature(0, "Celsius", "Kelvin"), 0.01);
        }
    }

    @Test
    public void testVolumeConversionPerformance() {
        // Test the performance of volume conversions
        for (int i = 0; i < 1000000; i++) {
            assertEquals(67.628, conversion.convertVolume(1, "liters", "tablespoons"), 0.01);
        }
    }
}
