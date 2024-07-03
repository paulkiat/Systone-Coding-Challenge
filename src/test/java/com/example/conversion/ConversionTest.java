// src/test/java/com/example/conversion/ConversionTest.java
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

        assertEquals(-17.78, conversion.convertTemperature(0, "Rankine", "Celsius"), 0.01);
        assertEquals(255.37, conversion.convertTemperature(0, "Rankine", "Kelvin"), 0.01);
        assertEquals(-459.67, conversion.convertTemperature(0, "Rankine", "Fahrenheit"), 0.01);
    }

    @Test
    public void testConvertVolume() {
        // Placeholder tests
        assertEquals(0.0, conversion.convertVolume(1, "liters", "cups"));
        assertEquals(0.0, conversion.convertVolume(1, "gallons", "liters"));
    }
}
