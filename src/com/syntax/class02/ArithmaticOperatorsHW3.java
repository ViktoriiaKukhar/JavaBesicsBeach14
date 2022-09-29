package com.syntax.class02;

public class ArithmaticOperatorsHW3 {

	public static void main(String[] args) {
		/* 1. Write a Java program to add, subtract, multiply and divide 2 decimal values.
		 *  Your program should say. “The __ of 2 numbers __ and  is equal to __”
		 *  +, -, *, /
		 */

		float a=90.6f;
		float b=25.4f;
		
		float sum=a+b;
		float sub=a-b;
		float div=a/b;
		float reminder=a%b;
		
		System.out.println("The sum of 2 numbers "+ a+ " and "+ b+ " is equal to " + sum);
		System.out.println("The sub of 2 numbers "+ a+ " and "+ b+ " is equal to " + sub);
		System.out.println("The divission of 2 numbers "+ a+ " and "+ b+ " is equal to " + div);
		System.out.println("The remider of 2 numbers "+ a+ " and "+ b+ " is equal to " + reminder);
		
		
		System.out.println("-------------------");
		/* 2. Write a program to find the square of the number 3.9. 
		 * You program should say “The square of the  is  “
		 */
	    
		float c=3.9f;
		System.out.println("The square of the "+ c + " is " + c*c);
		
	
		System.out.println("-------------------");
		/* 3. Writea program to print the area (S=d*e) and perimeter (P= 2*(d+e)) of a rectangle
		 *  with width (d) = 5 and  height (e) = 8.
		 *  Your program should say.
		 *   “The perimeter of a rectangle with width  and height __ is equal to __ and the area is __”
		 */
		
		int width= 5;
		int height= 8;
		
		int rectangleArea= width * height;
		int rectanglePerimeter= 2* (width + height); 
		
		System.out.println("The perimeter of a rectangle with width "+ width+ " and height "+ height 
				+ " is equal to " + rectanglePerimeter + " and the area is " + rectangleArea);
		
		
	}

}
