package com.syntax.class04;

import java.util.Scanner;

public class HW4 {

	public static void main(String[] args) {
		/*
		 * Task4
		 * 
		 * Create a Java program that will ask user to input city and temperature. 
		 * Your program should convert Fahrenheit into celsius and print 
		 * “The temperature is the city __ is __”
		 */
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("In which city do you live?");
		String city =scanner.next();
		
		System.out.println("What's the temperature there?");
		
		int temperature = scanner.nextInt();
		
		int temperatureF = ( temperature -32)*5/9;
		
		System.out.println("The temperature is the "+ city +  " is " + temperatureF);
		
		
	
		
	}

}
