package com.cognizant.calculator.phase02;

import java.util.Scanner;

/**
 * Add user input using a Scanner.
 */
public class CalcMain {

    public static void main(String[] args) {

        // declare and instantiate Scanner
        Scanner scanner = new Scanner(System.in);

        // declare all variables
        double num1, num2, result;

        // prompt for first number
        System.out.print("Number 1: ");
        num1 = scanner.nextDouble();

        // prompt for second number
        System.out.print("Number 2: ");
        num2 = scanner.nextDouble();

        // add
        result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);

        // subtract
        result = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + result);

        // multiply
        result = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + result);

        // divide
        result = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + result);

        // close scanner
        scanner.close();

    }

}
