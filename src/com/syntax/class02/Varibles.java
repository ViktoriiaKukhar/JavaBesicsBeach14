package com.syntax.class02;

public class Varibles {

	public static void main(String[] args) {
	//Task
		
	String name ="Viktorii";
	String lastName ="Kukhar";
	char grade ='A';
	String city ="Kyiv";
	String country ="Ukraine";
	String phoneNumber ="+ 3 8093 113 82 38";
	
	System.out.println("My name is "+ name + " and my last name is " + lastName);
	System.out.println("I am "+ grade + " great student");
	System.out.println("I live in "+ city+", " + country);
	System.out.println("And my phone number is "+ phoneNumber);
	
	grade ='B'; //  reassigning 
	city ="Lviv"; //  reassigning 
	phoneNumber ="+ 3 8063 114 42 38";
	
	System.out.println("----------------");
	System.out.println("My name is "+ name);
	System.out.println("I am "+ grade + " great student");
	System.out.println("I moved to new city "+ city + ", " + country);
	System.out.println("My new phone number is "+ phoneNumber);
	
	
	// Rules for Identifiers = name(variables, methods, classes)
	
	//1. cannot use keywords as identifiers
	//String new ="Hello"; -> error
	
	//2. cannot have spaces in identifiers
	// String last name ="Smith";
	
	//3. identifiers cannot start with numbers 
	// int 1number =123; -> error
	
	int number1 =123; //number can be anywhere after variables
	
	
	/*4. identifiers cannot contain any special characters 
	 *boolean hello!=true;  -> error
	 *
	 *except $ or _ 
	 */
	
	double $price$ =9.98;
	float _price1_ =1.99F; 
	
	/* Naming conventions
	 * 
	 * Class should start with Uppercase and follow camel casing 
	 * 
	 * variables should start with lowercase and follow camel casing 
	 */
	
	String Weather ="hot"; // not preferred
	String myWeather ="cold"; //preferred
	
	}

}
