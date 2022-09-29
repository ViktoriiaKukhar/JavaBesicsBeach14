package com.syntax.class06;

public class SwitchDemo2 {

	public static void main(String[] args) {
		
		/* matching cases must 
		 * 
		 */
		char choice='Y';
		
		String answer;
		
		switch (choice) {
		
		case'Y':
			answer="Yes";
			break;
		case'N':
			answer="No";
			break;
		case'M':
			answer="Maybe";
			break;
		default:
			answer= "Unknow";
			break;
		}
		System.out.println("answer");
		
		/*
		 * CANNOT work with boolean values
		 * CE: Cannot switch on a value of type boolean.
		 * boolean boo=true;

           switch(boo) {

           }

           CANNOT work with float/double and long
        */
	}

}
