package com.syntax.class05;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		/*
		 * Task2
		 * 
		 * Write a program for user to enter his/hers birth month. Based on the month define the season.
		 * Example: if user is born in March, April, May → season =”Spring” 
		 * if user is born in June, July, August → 
		 * season =”Summer”  etc …
		 */
		
		Scanner month = new Scanner (System.in);
		
		System.out.println("What month were you born in?");
		String monthOfBorn = month.next();
		
		if (monthOfBorn.equals("March") || monthOfBorn.equals("April") || monthOfBorn.equals("May")) 
		{
			System.out.println("Spring");
		}
		else if (monthOfBorn.equals("June") || monthOfBorn.equals("July") || monthOfBorn.equals("August")) 
		{
			System.out.println("Summer");
		}
		else if (monthOfBorn.equals("September") || monthOfBorn.equals("October") || monthOfBorn.equals("November")) 
		{
			System.out.println("Autumn");
		}
		else if (monthOfBorn.equals("December") || monthOfBorn.equals("January") || monthOfBorn.equals("Fabuary")) 
		{
			System.out.println("Winter");
		}
		else {
			System.out.println("Incorrect month entered");
		}
	}


}
