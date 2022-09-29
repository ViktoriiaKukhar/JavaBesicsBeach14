package com.syntax.class04;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		/*
		 * Task1
		 * 
		 * Write a program to store a boolean value of whether user has diploma or not. 
		 * If user has a diploma, you should say congratulations, 
		 * otherwise program should suggest to get a degree. 
		 * Then if user has a degree program should check a gpa score. 
		 * If gpa score is higher or equals to 3.5 → output should 
		 * say “You are eligible for scholarship”, otherwise → “You should have studied harder” .
		 */
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Do you have a diploma?");
	    String answer = scanner.next();
	
	
		if (answer.equals("yes"))
		{
			System.out.println("Congratulation!");
			System.out.println("What is your GPA score?");
			
			double gpa = scanner.nextDouble();
		
			if (gpa >= 3.5) 
			{
				System.out.println("You are eligible for scholarship");	
			}
			else 
			{
				System.out.println("You should have studied harder");
			}
		} 
		else if (answer.equals("no")) 
		{
			System.out.println("You should get a degree");
		}
		else {
			System.out.println("Answer shoulb be 'yes' or 'no'");
		}
		
	
		
	}

}
