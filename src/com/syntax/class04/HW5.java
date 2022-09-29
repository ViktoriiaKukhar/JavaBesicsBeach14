package com.syntax.class04;

import java.util.Scanner;

public class HW5 {

	public static void main(String[] args) {
		/*
		 * Task5
		 * 
		 * Create a Java program that will ask if user has a credit card or not. 
		 * If you user does not have a credit card then offer them. 
		 * If they do have one ask what is balance on the card? 
		 * If balance of the card is larger than 1000, tell them to pay off immediately, 
		 * otherwise you can tell them that they can spend more.
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Do you have a credit cart?");
	    String answer = scanner.next();
	    
	
		
		if (answer.equals("yes"))
		{
			System.out.println("What is balance on the card?");
			int balance = scanner.nextInt();
			
			if (balance > 1000) {
				System.out.println("You have to pay off immediately");	
			}
			else 
			{
				System.out.println("You can spend more");
			}
		} 
		else if (answer.equals("no")) 
		{
			System.out.println("Would you like to have one?");
		}
		else {
			System.out.println("Answer shoulb be 'yes' or 'no'");
		}
		
		
		
		}

}
