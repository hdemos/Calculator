package com.cognizant.calculator.phase02;

import java.util.Scanner;

/**
 * Adding user input
 */
public class CalcMain {

    public static void main(String[] args) {

        // declare and instantiate Scanner

        // declare all variables
        double num1 = 0.0, num2 = 0.0, result;

        // prompt for first number

        // prompt for second number

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

    }

}