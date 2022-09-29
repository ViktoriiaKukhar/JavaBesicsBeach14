package com.syntax.class08;

public class HWdigitalClock {

	public static void main(String[] args) {
		

	
	for (int h=0; h<=23; h++) {
		
			
		for (int m=0; m<=59; m++) 
		{
			
			if (m<=9 && h<=9)
			{
				System.out.println("0"+ h+ " : "+"0"+ m);
				
			}
			else if  (h<=9)
			{
				System.out.println ("0"+ h+ " : "+ m);
			}
			else if  (m<=9)
			{
				System.out.println (h+ " : "+ "0"+ m);
			}
			else 
			{
				System.out.println (h+ " : "+ m);
			}
			
		}
		
	}
	
	

	}

}
