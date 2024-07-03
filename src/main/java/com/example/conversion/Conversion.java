// src/main/java/com/example/conversion/Conversion.java
package com.example.conversion;

public class Conversion {

    public double convertTemperature(double value, String fromUnit, String toUnit) {
        switch (fromUnit) {
            case "Celsius":
                if (toUnit.equals("Kelvin")) {
                    return value + 273.15;
                } else if (toUnit.equals("Fahrenheit")) {
                    return value * 9 / 5 + 32;
                } else if (toUnit.equals("Rankine")) {
                    return (value + 273.15) * 9 / 5;
                }
                break;
            case "Kelvin":
                if (toUnit.equals("Celsius")) {
                    return value - 273.15;
                } else if (toUnit.equals("Fahrenheit")) {
                    return (value - 273.15) * 9 / 5 + 32;
                } else if (toUnit.equals("Rankine")) {
                    return value * 9 / 5;
                }
                break;
            case "Fahrenheit":
                if (toUnit.equals("Celsius")) {
                    return (value - 32) * 5 / 9;
                } else if (toUnit.equals("Kelvin")) {
                    return (value - 32) * 5 / 9 + 273.15;
                } else if (toUnit.equals("Rankine")) {
                    return value + 459.67;
                }
                break;
            case "Rankine":
                if (toUnit.equals("Celsius")) {
                    return (value - 491.67) * 5 / 9;
                } else if (toUnit.equals("Kelvin")) {
                    return value * 5 / 9;
                } else if (toUnit.equals("Fahrenheit")) {
                    return value - 459.67;
                }
                break;
        }
        throw new IllegalArgumentException("Invalid temperature units");
    }

    public double convertVolume(double value, String fromUnit, String toUnit) {
        switch (fromUnit) {
            case "liters":
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
        }
        throw new IllegalArgumentException("Invalid volume units");
    }
}
