package com.syntax.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Tack1 
		 * 
		 * 1. Prompt the user to enter person heights in inches. Person should be classified as one of the following: 
		 * - short (under 60 inch)
		 * - medium(between 60 -72 inch)
		 * - tall (over 72 inch)
		 */

 		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your heights");
	    int personHeights = scanner.nextInt();
	    
	    if (personHeights < 60) {
	    	System.out.println("Your height is short");
	    } 
	    else if (personHeights > 60 && personHeights < 72) {
	    	System.out.println("Your height is medium");
	    } 
	    else if (personHeights > 72) {
	    	System.out.println("Your height is tall");
	    }
	   

	}

}
