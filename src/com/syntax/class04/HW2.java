package com.syntax.class04;

public class HW2 {

	public static void main(String[] args) {
		
		/*
		 * Task2 
		 * 
		 * Create a Java program and store values of mortgage rate and mortgage price. 
		 * First, program should check if rate is higher than 4.5 user will not buy a house, 
		 * otherwise user will consider buying. Once user decides to buy a house, 
		 * if price of the house is larger than 200000 than user will take a loan, 
		 * otherwise user will pay cash
		 */
		
		System.out.println("********Task2********");
		
		
		double ratePrice = 2.5;
		double  mortgagePrice = 15000;
		
		if (ratePrice < 4.5) 
		{
			System.out.println("You couldn buy a house");
			
			if (mortgagePrice > 20000) 
			{
				System.out.println("You can take loan");
			}
			else 
			{
				System.out.println("You can pay by cart");
			}
		}
		else 
		{
			System.out.println("You couldn't buy a house");
		}
		
		
	}

}
