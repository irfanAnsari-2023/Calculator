package com.simpleCalculator;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		
		Scanner scanner  = new Scanner(System.in);
		double num1, num2;
		String operation;
		
		System.out.println("Enter first number");
		num1 = scanner.nextDouble();
		
		System.out.println("Enter second number");
		num2 = scanner.nextDouble();
		
		System.out.println("Enter operation ( +, -, *, /) : ");
		operation = scanner.next();
		
		try {
			switch(operation) {
			case "+":
				System.out.println(num1 + " + " +  num2 + " = " + (num1 + num2));
				break;
			case "-":
				System.out.println(num1 + " - " +  num2 + " = " + (num1 - num2));
				break;
			case "*":
				System.out.println(num1 + " * " +  num2 + " = " + (num1 * num2));
				break;
			case "/":
				if(num2 == 0) {
					throw new ArithmeticException("Cannot divide by zero.");
				}
				System.out.println(num1 + " / " +  num2 + " = " + (num1 / num2));
				break;
				default:
					System.out.println("Invalid Operation.");
			}
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}

	}

}
