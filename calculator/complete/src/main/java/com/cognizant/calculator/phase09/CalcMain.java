package com.cognizant.calculator.phase09;

import com.cognizant.calculator.phase08.service.Calculator;

import java.util.Scanner;

/**
 * Modify Calculator class to be a POJO instead of a utility class.  Use code in this class as a guide.
 */
public class CalcMain {

    public static void main(String[] args) {

        // declare and instantiate Scanner
        Scanner scanner = new Scanner(System.in);

        // declare and instantiate Calculator
        Calculator calc = new Calculator();

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

        // add operands to the calculator
        calc.setOperands(num1, num2);

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
                    result = calc.add();
                    operator = "+";
                    break;

                case 3:
                    result = calc.subtract();
                    operator = "-";
                    break;

                case 4:
                    result = calc.multiply();
                    operator = "*";
                    break;

                case 5:
                    if (num2 != 0.0) {
                        result = calc.divide();
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
