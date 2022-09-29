package com.syntax.class03;

public class HW {

	public static void main(String[] args) {
		/*
		 * Task1
		 * 
		 * Create a Java program (Class) and name it Double Comparison. 
		 * Declare 2 double values and if value of first variable is higher then the second, 
		 * print “Double value __ is larger than __ .” Otherwise print...
		 */

		double value1=100;
		double value2=120;
		
		if(value1>value2) 
			{
				System.out.println("Doublle value " + value1+" is larger than "+ value2);
			}
		else 
			{
				System.out.println("Doublle value " + value2+" is larger than "+ value1);
			}
			
		
		
		/*
		 * Task2
		 * 
		 * Create a Java program and name it Temperature Check.
		 * Create variable to store temperature. Your program should check 
		 * if temperature is below 32 then it should print “Water will freeze with temperature __”, otherwise 
		 * “Water will NOT freeze with temperature __”.
		 */
		
		double temperature1=35;
		
		if(temperature1<32)
		{
			System.out.println("Water will freeze with temperature "+temperature1);
		}
		else
		{
			System.out.println("Water will NOT freeze with temperature "+temperature1);
		}	
		
		
		/*
		 * Task3
		 * 
		 * Create a Java program and declare int variable that will hold a month. 
		 * Based on the value of the variable your program should print the name of the month.
		 * Write a program to check whether number is positive or negative.
		 * Interview Question
		 * Write a Java Program to check whether number is Even or Odd.
		 */
		
		int month=2;
		
		if(month==1)
		{
			System.out.println("January");
		}
		else if (month==2)
		{
			System.out.println("February");
		}	
		else if (month==3)
		{
			System.out.println("March");
		}	
		else if (month==4)
		{
			System.out.println("April");
		}	
		else if (month==5)
		{
			System.out.println("May");
		}	
		else if (month==6)
		{
			System.out.println("June");
		}	
		else if (month==7)
		{
			System.out.println("July");
		}	
		else if (month==8)
		{
			System.out.println("Augest");
		}	
		else if (month==9)
		{
			System.out.println("September");
		}		
		else if (month==10)
		{
			System.out.println("October");
		}	
		else if (month==11)
		{
			System.out.println("November");
		}	
		else if (month==12)
		{
			System.out.println("December");
		}
		else
		{
			System.out.println("Invalid Month number please enter 1-12");
		}
		
	
		
		
	}

}
