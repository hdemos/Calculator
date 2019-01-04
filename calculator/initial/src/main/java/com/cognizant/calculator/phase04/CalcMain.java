package com.cognizant.calculator.phase04;

import java.util.Scanner;

/**
 * Add a menu to the calculator.  Use a StringBuilder to create a menu.
 */
public class CalcMain {

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
            // TODO build menu using StringBuilder

            // display menu and prompt
            System.out.print(builder);
            menuChoice = scanner.nextInt();

            switch (menuChoice) {

                case 1: // TODO implement getting new numbers
                    // prompt for first number


                    // prompt for second number


                    break;

                case 2: // TODO implement add
                    // add

                    break;

                case 3: // TODO implement subtract
                    // subtract

                    break;

                case 4: // TODO implement multiply
                    // multiply

                    break;

                case 5: // TODO implement divide
                    // divide

                    break;

                case 6:
                    valid = false;
                    break;

                default:
                    // invalid operation - let the user know!
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
