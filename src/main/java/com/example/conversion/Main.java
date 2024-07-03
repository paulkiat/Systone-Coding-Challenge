package com.example.conversion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Create an instance of InputHandler to process the input and perform conversions
        InputHandler inputHandler = new InputHandler();

        // Print a welcome message for the application
        System.out.println("Unit Conversion Application");
        
        // Prompt the user to enter the input value and read it
        System.out.print("Enter input value: ");
        double inputValue = scanner.nextDouble();
        
        // Prompt the user to enter the input unit and read it
        System.out.print("Enter input unit: ");
        String inputUnit = scanner.next();
        
        // Prompt the user to enter the target unit and read it
        System.out.print("Enter target unit: ");
        String targetUnit = scanner.next();
        
        // Prompt the user to enter the student's response and read it
        System.out.print("Enter student response: ");
        double studentResponse = scanner.nextDouble();

        // Call the handleInput method of InputHandler to process the inputs and get the result
        String result = inputHandler.handleInput(inputValue, inputUnit, targetUnit, studentResponse);
        
        // Print the result of the conversion and the correctness of the student's response
        System.out.println("Result: " + result);
    }
}
