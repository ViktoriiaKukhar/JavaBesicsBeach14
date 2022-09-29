package com.syntax.class09;

public class ArrayDemo2 {

	public static void main(String[] args) {
		
		String[] drinks= {"fanta", "milk", "juice", "lemonade"};
		
		System.out.println(drinks[2]);// juice
		
		// drinks[5]="water";
		// System.out.println(drinks[5]);

		// how many elements inside my array? 
		
		int size=drinks.length; //-> will give # of elements in the array
		
		System.out.println("Size of array = "+ size);
		
	}

}
