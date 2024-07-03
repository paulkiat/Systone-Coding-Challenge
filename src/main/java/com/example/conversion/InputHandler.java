package com.example.conversion;

public class InputHandler {

    // Create an instance of the Conversion class to perform unit conversions
    private final Conversion conversion = new Conversion();

    /**
     * Handles the input from the user, performs the conversion, and checks the student's response.
     * 
     * @param value           The value to be converted.
     * @param fromUnit        The unit of the value to be converted from.
     * @param toUnit          The unit to convert the value to.
     * @param studentResponse The student's response for the converted value.
     * @return                "Correct" if the student's response matches the converted value,
     *                        "Incorrect" if it does not match,
     *                        "Invalid" if the input units are invalid or the conversion fails.
     */
    public String handleInput(double value, String fromUnit, String toUnit, double studentResponse) {
        try {
            double convertedValue;

            // Check if the units are temperature units and perform temperature conversion
            if (isTemperatureUnit(fromUnit) && isTemperatureUnit(toUnit)) {
                convertedValue = conversion.convertTemperature(value, fromUnit, toUnit);

            // Check if the units are volume units and perform volume conversion
            } else if (isVolumeUnit(fromUnit) && isVolumeUnit(toUnit)) {
                convertedValue = conversion.convertVolume(value, fromUnit, toUnit);

            // If units do not match any known types, return "Invalid"
            } else {
                return "Invalid";
            }

            // Check the student's response against the converted value
            return checkResponse(convertedValue, studentResponse);

        } catch (IllegalArgumentException e) {
            // If an exception is thrown during conversion, return "Invalid"
            return "Invalid";
        }
    }

    /**
     * Checks if the given unit is a temperature unit.
     * 
     * @param unit The unit to check.
     * @return     True if the unit is a temperature unit, false otherwise.
     */
    private boolean isTemperatureUnit(String unit) {
        return unit.equals("Celsius") || unit.equals("Kelvin") || unit.equals("Fahrenheit") || unit.equals("Rankine");
    }

    /**
     * Checks if the given unit is a volume unit.
     * 
     * @param unit The unit to check.
     * @return     True if the unit is a volume unit, false otherwise.
     */
    private boolean isVolumeUnit(String unit) {
        return unit.equals("liters") || unit.equals("tablespoons") || unit.equals("cubic-inches") || unit.equals("cups")
                || unit.equals("cubic-feet") || unit.equals("gallons");
    }

    /**
     * Checks if the student's response matches the converted value.
     * 
     * @param convertedValue  The value after conversion.
     * @param studentResponse The student's response to be checked.
     * @return                "Correct" if the student's response matches the converted value,
     *                        "Incorrect" if it does not match.
     */
    private String checkResponse(double convertedValue, double studentResponse) {
        // Round both the converted value and the student's response to one decimal place and compare
        if (Math.round(convertedValue * 10) / 10.0 == Math.round(studentResponse * 10) / 10.0) {
            return "Correct";
        } else {
            return "Incorrect";
        }
    }
}
