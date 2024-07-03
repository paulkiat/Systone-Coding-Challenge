package com.example.conversion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConversionTest {
    private final Conversion conversion = new Conversion();

    @Test
    public void testConvertTemperature() {
        assertEquals(273.15, conversion.convertTemperature(0, "Celsius", "Kelvin"), 0.01);
        assertEquals(32.0, conversion.convertTemperature(0, "Celsius", "Fahrenheit"), 0.01);
        assertEquals(491.67, conversion.convertTemperature(0, "Celsius", "Rankine"), 0.01);

        assertEquals(-273.15, conversion.convertTemperature(0, "Kelvin", "Celsius"), 0.01);
        assertEquals(-459.67, conversion.convertTemperature(0, "Kelvin", "Fahrenheit"), 0.01);
        assertEquals(0.0, conversion.convertTemperature(0, "Kelvin", "Rankine"), 0.01);

        assertEquals(0.0, conversion.convertTemperature(32, "Fahrenheit", "Celsius"), 0.01);
        assertEquals(273.15, conversion.convertTemperature(32, "Fahrenheit", "Kelvin"), 0.01);
        assertEquals(491.67, conversion.convertTemperature(32, "Fahrenheit", "Rankine"), 0.01);

        assertEquals(-273.15, conversion.convertTemperature(0, "Rankine", "Celsius"), 0.01);
        assertEquals(0.0, conversion.convertTemperature(0, "Rankine", "Kelvin"), 0.01);
        assertEquals(-459.67, conversion.convertTemperature(0, "Rankine", "Fahrenheit"), 0.01);
    }

    @Test
    public void testConvertVolume() {
        assertEquals(67.628, conversion.convertVolume(1, "liters", "tablespoons"), 0.01);
        assertEquals(3.785, conversion.convertVolume(1, "gallons", "liters"), 0.01);
    }

    @Test
    public void testTemperatureConversionEdgeCases() {
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
        // Very small numbers
        assertEquals(0.067628, conversion.convertVolume(0.001, "liters", "tablespoons"), 0.00001);

        // Very large numbers
        assertEquals(67628.0, conversion.convertVolume(1000, "liters", "tablespoons"), 0.1);

        // Boundary conditions
        assertEquals(0.0, conversion.convertVolume(0, "liters", "gallons"), 0.01);
    }

        @Test
    public void testTemperatureConversionPerformance() {
        for (int i = 0; i < 1000000; i++) {
            assertEquals(273.15, conversion.convertTemperature(0, "Celsius", "Kelvin"), 0.01);
        }
    }

    @Test
    public void testVolumeConversionPerformance() {
        for (int i = 0; i < 1000000; i++) {
            assertEquals(67.628, conversion.convertVolume(1, "liters", "tablespoons"), 0.01);
        }
    }
}