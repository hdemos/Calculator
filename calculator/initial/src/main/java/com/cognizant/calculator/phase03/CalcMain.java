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
        String operation = "";

        // prompt for first number
        System.out.print("Number 1: ");
        num1 = scanner.nextDouble();

        // prompt for second number
        System.out.print("Number 2: ");
        num2 = scanner.nextDouble();

        // prompt for the operation
        // TODO implement prompt

        // use switch to do calculation
        // TODO implement using switch to determine which operation has been chosen

        // display results
        if (valid) {
            System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
        }

        // close scanner
        scanner.close();

    }

}
