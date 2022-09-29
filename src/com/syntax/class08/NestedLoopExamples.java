package com.syntax.class08;

public class NestedLoopExamples {

	public static void main(String[] args) {
		
		// car speedometer
		
		for (int a=0; a<=9; a++) 
		{
			for (int d=0;  d<=9; d++) 
			{
				for (int c=0;  c<=9; c++) 
				{
					System.out.println(a+ "  "+ d + " "+c);
				}
			}
		}
		
		System.out.println("-----------------");
		// multiplication table
		
		for (int i=1; i<=9; i++) 
		{
			
			for (int j=1; j<=9; j++) 
			{
				
				System.out.println(i+ " x "+j+" = "+i*j);
			}
			
			System.out.println("-----------------");
			
		}
	}

}
