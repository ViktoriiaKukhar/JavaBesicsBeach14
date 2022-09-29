package com.syntax.class06;

import java.util.Scanner;

public class HWSwitchCalculator {

	public static void main(String[] args) {
		/*
		 * Task3
		 * Using scanner class create calculator. Allow user to enter 2 numbers and 
		 * operator(+,-,*,/). Based on operator provide the result to user.
		 * Please complete this assignment in 2 ways: using if statement and switch case.
		 */
		
		Scanner calculator = new Scanner(System.in);
		
		System.out.println("Please enter first number");
		double n1 = calculator.nextDouble();
		
		System.out.println("Please enter second number");
		double n2 = calculator.nextDouble();
		
		System.out.println("Please enter operator(+,-,*,/)");
		char operator = calculator.next().charAt(0);
		
		double result=0;
		
		switch(operator) {
		case '+':
			 result = n1+n2;
			 break;
		case '-':
			 result = n1-n2;
			 break;
		case '*':
			 result = n1*n2;
			 break;
		case '/':
			 result = n1/n2;
		}
		System.out.println(result);
	}

}
