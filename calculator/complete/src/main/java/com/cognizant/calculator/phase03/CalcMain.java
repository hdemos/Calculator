package com.cognizant.calculator.phase03;

import java.util.Scanner;

/**
 * Add operation selection functionality.
 */
public class CalcMain {

    public static void main(String[] args) {

        // declare and instantiate Scanner
        Scanner scanner = new Scanner(System.in);

        // declare all variables
        double num1, num2, result = 0;
        boolean valid = true;
        String operation;

        // prompt for first number
        System.out.print("Number 1: ");
        num1 = scanner.nextDouble();

        // prompt for second number
        System.out.print("Number 2: ");
        num2 = scanner.nextDouble();

        // prompt for the operation
        System.out.print("Operation(+, -, *, /): ");
        operation = scanner.next();

        // use switch to do calculation
        switch (operation) {

            case "+":
                result = num1 + num2;
                break;

            case "-":
                result = num1 - num2;
                break;

            case "*":
                result = num1 * num2;
                break;

            case "/":
                if (num2 != 0.0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Cannot divide by zero.");
                    valid = false;
                }
                break;

            default:
                System.out.println("Invalid operation [" + operation + "].");
                valid = false;
        }

        // display results
        if (valid) {
            System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
        }

        // close scanner
        scanner.close();

    }

}
