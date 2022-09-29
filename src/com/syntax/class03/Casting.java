package com.syntax.class03;

public class Casting {

	public static void main(String[] args) {
		/*
		 * type casting -> type = data type casting = converting
		 */
		
		byte box1=127; //smallest box
		short box2=3333; // slightly large box (double the size of box1 in terms of bits 16 bits)_ 
		int box3=45454545; //large box more commonly used (32 bits) 
		long box4=45454545; // slightly large box
		
		float box5=414564545; // larger box
		double box6=454545444; //largest
		
		
		int number=(int)15.2; // we can't store the decimal number in the box of type int 
		System.out.println(number);
		
		long smallerBox=(long)box2;
		System.out.println(smallerBox);
		
		short biggerBox=box1;
		
		long box7=box1; // we can do this because box7 is largest that box1 
		
		// as box6 is larger it is double we need type casting to assign the value
		float box8=(float)box6; 
		System.out.println(box8);
		
		char a=(char)65;
		System.out.println(a);
		
		char b=(char)66;
		System.out.println(b);
		
		int box9=(int)box4;
		System.out.println(box9);
		
		short box=5555;
		byte box10=(byte)box;
		System.out.println(box10);
		
		
		/*
		 *  What is type casting?
		 *  type casting is converting one data type to another data type 
		 *  
		 *  Why should I learn about type casting? 
		 *  so that we can use the code that is written by someone else to make our life easier
		 *  or when we will be working in teams we will be able to merge the code
		 *  
		 *  What is the syntax for type casting?
		 *  when we are converting something smaller to larger we don't need to do anything
		 *  it happens automatically we just assign the variable foe example
		 *  
		 *  int box=1234;
		 *  long box2=(long)box; // this is how it works ant it is called implicit or widening automatic
		 *  
		 *  however when we convert a larger data type to a smaller data type
		 *  then this is how we do it
		 *  
		 *  long box=1245454;
		 *  
		 *  int box2=(int)box; narrowing or explicit or manual conversion
		 */
		
		
		
		
	}

}
