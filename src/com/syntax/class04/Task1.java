package com.syntax.class04;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Write a Java Program to check whether number is Even or Odd
		 */

		
		int number=7;
		System.out.println(number%2);
		// if we take the modulus of number by2 and answer is 0 it is always an Even number
		// otherwise it is an Odd number 
		
		
		if(number%2==0)
		{
			System.out.println("Number is Even");	
		}
		else
		{
			System.out.println("Number is Odd");
		}
		
		/*
		 * Write a Java Program to check whether number is positive or negative 
		 */
		
		int number2=-15;
				
		if(number2>0)
		{
			System.out.println("Number is Positive");
		}
		else if(number2<0)
		{
			System.out.println("Number is Negative");
		}
		else 
		{
			System.out.println("Number is neither positive not negative");
		}
		
		
		
	}

}
