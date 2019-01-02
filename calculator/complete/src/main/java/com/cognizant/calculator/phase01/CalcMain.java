package com.cognizant.calculator.phase01;

public class CalcMain {

    public static void main(String[] args) {

        double num1 = 27, num2 = 12;
        double result;

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
    }

}
