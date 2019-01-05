package com.cognizant.calculator.phase10;
//add exception handling

import java.util.Scanner;

import com.cognizant.calculator.phase09.service.Calculator;

public class CalcMain {
	
	

	public static void main(String[] args) {

		Calculator calc = new Calculator();
		Scanner sc = new Scanner(System.in);
		double num1, num2, result = 0;
		boolean valid = true;
		int operation;
		String operator = "";
		System.out.print("Number 1: ");
		num1 = sc.nextDouble();
		System.out.print("Number 2: ");
		num2 = sc.nextDouble();
		calc.setOperands(num1, num2);
		do {
			valid = true;
			System.out.println("Pick an action:\n" + "1) Change numbers"
					+ "2) Add numbers" + "3) Subtract numbers"
					+ "4) Multiply numbers" + "5) Divide numbers" + "6) Exit");
			System.out.print(": ");

			operation = sc.nextInt();

			switch (operation) {
			case 1:
				System.out.print("Number 1: ");
				num1 = sc.nextDouble();
				System.out.print("Number 2: ");
				num2 = sc.nextDouble();
				calc.setOperands(num1, num2);
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
				try{
					result = calc.divide();
					operator = "/";
				}
				catch(ArithmeticException e) {
					System.out.println(e.getMessage());
					valid = false;
				}
				break;
			case 6:
				valid = false;
			default:
				System.out.println("Invalid operation.");
				valid = false;
			}

			if (valid) {
				System.out.println(num1 + " " + operator + " " + num2 + " = "
						+ result);
			}
		} while (operation != 6);
		System.out.println("Good bye!");
		sc.close();
	}

}
