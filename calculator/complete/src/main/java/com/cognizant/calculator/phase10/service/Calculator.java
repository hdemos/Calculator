package com.cognizant.calculator.phase10.service;

/**
 * Calculator utility class
 */
public class Calculator {

    private double num1;
    private double num2;

    public Calculator() {
        this(1, 1);
    }

    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() {
        return num1 + num2;
    }

    public double subtract() {
        return num1 - num2;
    }

    public double multiply() {
        return num1 * num2;
    }

    public double divide() {

        if(num2 == 0.0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return num1 / num2;
    }

    public void setOperands(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

}
