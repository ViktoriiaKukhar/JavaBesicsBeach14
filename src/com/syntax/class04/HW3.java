package com.syntax.class04;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		/*
		 * Task3.1
		 * 
		 * You are a loan specialist and you need to ask user what is the amount of loan is needed. 
		 * If loan is less or equal to 200,000 then you would lend the money otherwise 
		 * you would reject the client.
		 * 
		 */
	
		Scanner scanner= new Scanner(System.in);
		System.out.println("How much loan do you need?");
		int amountOfLoan =scanner.nextInt();
		
		if (amountOfLoan <= 200000) 
		{
			System.out.println("Our bank ready to lend the money to you");
		}
		else 
		{
			System.out.println("Unfortunately, our bank won't give you credit");
		}
		
		
	
	}

}
