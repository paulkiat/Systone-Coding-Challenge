package com.example.conversion;

public class Conversion {

    public double convertTemperature(double value, String fromUnit, String toUnit) {
        switch (fromUnit) {
            case "Celsius":
                if (toUnit.equals("Kelvin")) {
                    return value + 273.15;
                } else if (toUnit.equals("Fahrenheit")) {
                    return value * 9/5 + 32;
                } else if (toUnit.equals("Rankine")) {
                    return (value + 273.15) * 9/5;
                }
                break;
            case "Kelvin":
                if (toUnit.equals("Celsius")) {
                    return value - 273.15;
                } else if (toUnit.equals("Fahrenheit")) {
                    return (value - 273.15) * 9/5 + 32;
                } else if (toUnit.equals("Rankine")) {
                    return value * 9/5;
                }
                break;
            case "Fahrenheit":
                if (toUnit.equals("Celsius")) {
                    return (value - 32) * 5/9;
                } else if (toUnit.equals("Kelvin")) {
                    return (value - 32) * 5/9 + 273.15;
                } else if (toUnit.equals("Rankine")) {
                    return value + 459.67;
                }
                break;
            case "Rankine":
                if (toUnit.equals("Celsius")) {
                    return (value - 491.67) * 5/9;
                } else if (toUnit.equals("Kelvin")) {
                    return value * 5/9;
                } else if (toUnit.equals("Fahrenheit")) {
                    return value - 459.67;
                }
                break;
        }
        throw new IllegalArgumentException("Invalid temperature units");
    }

    public double convertVolume(double value, String fromUnit, String toUnit) {
        // Placeholder logic for volume conversion
        return 0.0;
    }
}
