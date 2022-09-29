package review.class1;

public class VariablesDemo1 {

	public static void main(String[] args) {
		/*
		 * if we want to store whole number we can use below data types numbers 
		 * without decimal part like 10, 23, 4000, 10000 etc but we can't use them
		 * to store decimal numbers like 12.3 1.5 100.4 etc
		 * 
		 * byte
		 * short
		 * int - popular one 
		 * long
		 * 
		 * RAM - memory where computer stores the programs which are opened and running currently 
		 */
		
		int box1=12;
		// char box1='S'; not allowed as it creates confusion 
		// int -> data type
		// box -> variable name
		// = assignment operator and used to store data in variable 
		// 12 its the data that we want to store in box1
		// ; -> language rule we need to end all the lines with semicolons
		
		int box2; // creating a box but not storing data right away in the box
		box2=20;
		
		box1=30; // replacing the value 12 stored in box1 30

		System.out.println(box1);
		System.out.println(box2);
		
		
		
	}

}
