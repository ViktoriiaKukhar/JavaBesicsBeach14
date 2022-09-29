package com.syntax.class01;

public class PrimitiveDataTypes {

	public static void main(String[] args) {
		
		
		// storing and representing whole numeric values;
		byte box1 =127;
		short box2 =32767;	
		int box3 =10000; //popular
		long box4 =5765869886976L; //credit cart,transaction -(L/l - in the end)

		//storing and representing decimals value;
		float variable1   =    1.99F;
		double variable2 =99.99; //popular
		
		//storing single characters
		char container ='A'; // A, a, &, $ 
		char  dollar ='$'; 
		
		//storing yes or no values 
		boolean hot =true;
		boolean  tired =false; 
		
		System.out.println(variable2); // printing value of the variable2 
		System.out.println("variable2"); //printing text variable 
		
		System.out.println(tired);
		//System.out.println(variable3); error - variable does not exists 
		
		System.out.println(box1);
		System.out.println(box2);
		System.out.println(box3);
		System.out.println(box4);
		System.out.println(variable1);
		System.out.println(variable2);
		System.out.println(hot);
		System.out.println(tired);
		
	}

}
