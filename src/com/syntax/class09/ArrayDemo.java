package com.syntax.class09;

public class ArrayDemo {

	public static void main(String[] args) {
		
		
		int[] arr = new int[4];
		
		// store elements inside an array
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		
		// accessing elements from the array
		System.out.println(arr[2]);  //30
		  
		System.out.println(arr[1]+arr[2]);  //50
		
		//Lets create an array and store your classmates 
		
		String[] name = new String[5];
		name[0]="Shah";
		name[1]="Vera";
		name[2]="Roman";
		name[3]="Guljan";
		name[4]="Anna";
	
		System.out.println("Hello" + name[1]);
		
		
		
	}

}
