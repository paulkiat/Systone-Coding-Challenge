package com.example.conversion;

public class Conversion {

    /**
     * Converts a temperature value from one unit to another.
     * 
     * @param value The temperature value to convert.
     * @param fromUnit The unit of the temperature value.
     * @param toUnit The target unit to convert to.
     * @return The converted temperature value.
     * @throws IllegalArgumentException if the units are invalid.
     */
    public double convertTemperature(double value, String fromUnit, String toUnit) {
        // Determine the conversion logic based on the source unit
        switch (fromUnit) {
            case "Celsius":
                // Convert from Celsius to the target unit
                if (toUnit.equals("Kelvin")) {
                    return value + 273.15;
                } else if (toUnit.equals("Fahrenheit")) {
                    return value * 9 / 5 + 32;
                } else if (toUnit.equals("Rankine")) {
                    return (value + 273.15) * 9 / 5;
                }
                break;
            case "Kelvin":
                // Convert from Kelvin to the target unit
                if (toUnit.equals("Celsius")) {
                    return value - 273.15;
                } else if (toUnit.equals("Fahrenheit")) {
                    return (value - 273.15) * 9 / 5 + 32;
                } else if (toUnit.equals("Rankine")) {
                    return value * 9 / 5;
                }
                break;
            case "Fahrenheit":
                // Convert from Fahrenheit to the target unit
                if (toUnit.equals("Celsius")) {
                    return (value - 32) * 5 / 9;
                } else if (toUnit.equals("Kelvin")) {
                    return (value - 32) * 5 / 9 + 273.15;
                } else if (toUnit.equals("Rankine")) {
                    return value + 459.67;
                }
                break;
            case "Rankine":
                // Convert from Rankine to the target unit
                if (toUnit.equals("Celsius")) {
                    return (value - 491.67) * 5 / 9;
                } else if (toUnit.equals("Kelvin")) {
                    return value * 5 / 9;
                } else if (toUnit.equals("Fahrenheit")) {
                    return value - 459.67;
                }
                break;
            default:
                // Throw an exception if the source unit is invalid
                throw new IllegalArgumentException("Invalid temperature units");
        }
        // Throw an exception if the target unit is invalid
        throw new IllegalArgumentException("Invalid temperature units");
    }

    /**
     * Converts a volume value from one unit to another.
     * 
     * @param value The volume value to convert.
     * @param fromUnit The unit of the volume value.
     * @param toUnit The target unit to convert to.
     * @return The converted volume value.
     * @throws IllegalArgumentException if the units are invalid.
     */
    public double convertVolume(double value, String fromUnit, String toUnit) {
        // Determine the conversion logic based on the source unit
        switch (fromUnit) {
            case "liters":
                // Convert from liters to the target unit
                if (toUnit.equals("tablespoons")) {
                    return value * 67.628;
                } else if (toUnit.equals("cubic-inches")) {
                    return value * 61.024;
                } else if (toUnit.equals("cups")) {
                    return value * 4.227;
                } else if (toUnit.equals("cubic-feet")) {
                    return value / 28.317;
                } else if (toUnit.equals("gallons")) {
                    return value / 3.785;
                }
                break;
            case "tablespoons":
                // Convert from tablespoons to the target unit
                if (toUnit.equals("liters")) {
                    return value / 67.628;
                } else if (toUnit.equals("cubic-inches")) {
                    return value / 1.108;
                } else if (toUnit.equals("cups")) {
                    return value / 16.231;
                } else if (toUnit.equals("cubic-feet")) {
                    return value / 1915.013;
                } else if (toUnit.equals("gallons")) {
                    return value / 256;
                }
                break;
            case "cubic-inches":
                // Convert from cubic-inches to the target unit
                if (toUnit.equals("liters")) {
                    return value / 61.024;
                } else if (toUnit.equals("tablespoons")) {
                    return value * 1.108;
                } else if (toUnit.equals("cups")) {
                    return value / 14.646;
                } else if (toUnit.equals("cubic-feet")) {
                    return value / 1728;
                } else if (toUnit.equals("gallons")) {
                    return value / 231;
                }
                break;
            case "cups":
                // Convert from cups to the target unit
                if (toUnit.equals("liters")) {
                    return value / 4.227;
                } else if (toUnit.equals("tablespoons")) {
                    return value * 16.231;
                } else if (toUnit.equals("cubic-inches")) {
                    return value * 14.646;
                } else if (toUnit.equals("cubic-feet")) {
                    return value / 119.688;
                } else if (toUnit.equals("gallons")) {
                    return value / 16;
                }
                break;
            case "cubic-feet":
                // Convert from cubic-feet to the target unit
                if (toUnit.equals("liters")) {
                    return value * 28.317;
                } else if (toUnit.equals("tablespoons")) {
                    return value * 1915.013;
                } else if (toUnit.equals("cubic-inches")) {
                    return value * 1728;
                } else if (toUnit.equals("cups")) {
                    return value * 119.688;
                } else if (toUnit.equals("gallons")) {
                    return value * 7.481;
                }
                break;
            case "gallons":
                // Convert from gallons to the target unit
                if (toUnit.equals("liters")) {
                    return value * 3.785;
                } else if (toUnit.equals("tablespoons")) {
                    return value * 256;
                } else if (toUnit.equals("cubic-inches")) {
                    return value * 231;
                } else if (toUnit.equals("cups")) {
                    return value * 16;
                } else if (toUnit.equals("cubic-feet")) {
                    return value / 7.481;
                }
                break;
            default:
                // Throw an exception if the source unit is invalid
                throw new IllegalArgumentException("Invalid volume units");
        }
        // Throw an exception if the target unit is invalid
        throw new IllegalArgumentException("Invalid volume units");
    }
}
