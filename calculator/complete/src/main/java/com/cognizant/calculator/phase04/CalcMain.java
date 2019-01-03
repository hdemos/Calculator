package com.cognizant.calculator.phase04;

import java.util.Scanner;

/**
 * Adding menu
 */
public class CalcMain {

    public static void main(String[] args) {

        // declare and instantiate Scanner
        Scanner scanner = new Scanner(System.in);

        // declare all variables
        double num1, num2, result = 0;
        boolean valid = true;
        int choice;
        String operation = "";

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
            operation = "";

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
            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    // prompt for first number
                    System.out.print("Number 1: ");
                    num1 = scanner.nextDouble();

                    // prompt for second number
                    System.out.print("Number 2: ");
                    num2 = scanner.nextDouble();
                    break;

                case 2:
                    result = num1 + num2;
                    operation = "+";
                    break;

                case 3:
                    result = num1 - num2;
                    operation = "-";
                    break;

                case 4:
                    result = num1 * num2;
                    operation = "*";
                    break;

                case 5:
                    if (num2 != 0.0) {
                        result = num1 / num2;
                        operation = "/";
                    } else {
                        System.out.println("Cannot divide by zero.");
                        valid = false;
                    }
                    break;

                case 6:
                    valid = false;
                    break;

                default:
                    System.out.println("Invalid operation [" + operation + "].");
                    valid = false;
            }

            // display results
            if (valid) {
                System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
            }

        } while (choice != 6);

        // close scanner and exit
        System.out.println("Good-bye!");
        scanner.close();

    }

}
