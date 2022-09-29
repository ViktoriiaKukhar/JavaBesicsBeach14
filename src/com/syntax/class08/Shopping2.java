package com.syntax.class08;

import java.util.Scanner;

public class Shopping2 {

	public static void main(String[] args) {
		/*
		 * Write a program to ask a user to enter item they want to buy and the price of that item. 
		 * Every time user enters money, accumulate the amount and tell the user how much is left to pay off.
		 * If user give more money program should return a change. Whenever user done with payments 
		 * program should say "Thank you for shopping!"
		 */
		Scanner input = new Scanner (System.in);
		
		
		String item = "Book";
		double price =15;
		double total=0;
		
		do {
			double money = input.nextDouble();
			total+=money;
			
			if (total<price) 
			{
				System.out.println("Amount that you need to pay" + (price - total)); 
			} 
			else if (total>price)
			{
				System.out.println("It is you surrender "+ (total-price)); 
			}
			}
		while (total<price); 
			System.out.println("Thank you for shopping");

	}

}
