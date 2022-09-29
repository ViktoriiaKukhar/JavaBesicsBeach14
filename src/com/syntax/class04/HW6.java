package com.syntax.class04;

import java.util.Scanner;

public class HW6 {

	public static void main(String[] args) {
		/*
		 * Task6
		 * 
		 * Write a program to ask user to enter numbers of worked years and annual salary. 
		 * If user worked for more or equals to 5 years than user is eligible for the bonus, 
		 * otherwise he is not. Once user is eligible and salary is larger than 
		 * 50000 than bonus = 5000, otherwise bonus=3000.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many years have you worked?");
	    int workingYears = scanner.nextInt();
	    
	    System.out.println("What was your annual salary?");
	    int annualSalary = scanner.nextInt();
	    
	    if (workingYears>=5) 
	    {
	    	System.out.println("Our congratulation! You have a bonus");
	    	
	    	if (annualSalary>5000) 
	    	{
	    		System.out.println("Your bonus = 5000");
	    	}
	    	else 
	    	{
	    		System.out.println("Your bonus = 3000");
	    	}
	    		
	    } 
	    else 
	    {
	    	System.out.println("You don't have a bonus");
	    }
		
	    
	    
	}

}
