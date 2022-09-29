package com.syntax.class04;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		/*
		 * Task3.2
		 * 
		 * You are DMV representative and you need to ask customer their age.
		 * If they are 18 and older you will issue a driver licence to them, 
		 * otherwise you will offer them to get a learners permit.
		 */
		

		Scanner scanner= new Scanner(System.in);
		
		System.out.println("How old are you?");
		int age =scanner.nextInt();
		
		if (age>=18)
		{
			System.out.println("We can issue a driver licence to you");
		}
		else 
		{
			System.out.println("You should get a learners permit");
		}

	}

}
