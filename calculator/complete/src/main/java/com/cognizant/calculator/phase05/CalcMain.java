package com.cognizant.calculator.phase05;

import java.util.Scanner;

/**
 * Extract functionality into separate methods.
 */
public class CalcMain {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {

        // declare and instantiate Scanner
        Scanner scanner = new Scanner(System.in);

        // declare all variables
        double num1, num2, result = 0;
        boolean valid = true;
        int menuChoice;
        String operator = "";

        // prompt for first number
        System.out.print("Number 1: ");
        num1 = scanner.nextDouble();

        // prompt for second number
        System.out.print("Number 2: ");
        num2 = scanner.nextDouble();

        // use do-while to loop and prompt
        do {
            // reset flag
            valid = true;
            operator = "";

            // build menu
            StringBuilder builder = new StringBuilder();
            builder.append("Pick an action:\n");
            builder.append("1) Change numbers\n");
            builder.append("2) Add numbers\n");
            builder.append("3) Subtract numbers\n");
            builder.append("4) Multiply numbers\n");
            builder.append("5) Divide numbers\n");
            builder.append("6) Exit\n");
            builder.append(":");

            // display menu and prompt
            System.out.print(builder);
            menuChoice = scanner.nextInt();

            switch (menuChoice) {

                case 1:
                    // prompt for first number
                    System.out.print("Number 1: ");
                    num1 = scanner.nextDouble();

                    // prompt for second number
                    System.out.print("Number 2: ");
                    num2 = scanner.nextDouble();
                    break;

                case 2:
                    result = add(num1, num2);
                    operator = "+";
                    break;

                case 3:
                    result = subtract(num1, num2);
                    operator = "-";
                    break;

                case 4:
                    result = multiply(num1, num2);
                    operator = "*";
                    break;

                case 5:
                    if (num2 != 0.0) {
                        result = divide(num1, num2);
                        operator = "/";
                    } else {
                        System.out.println("Cannot divide by zero.");
                        valid = false;
                    }
                    break;

                case 6:
                    valid = false;
                    break;

                default:
                    System.out.println("Invalid operation [" + operator + "].");
                    valid = false;
            }

            // display results
            if (valid) {
                System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
            }

        } while (menuChoice != 6);

        // close scanner and exit
        System.out.println("Good-bye!");
        scanner.close();

    }

}
