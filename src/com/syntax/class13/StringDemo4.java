package com.syntax.class13;

import java.util.Arrays;

public class StringDemo4 {

	public static void main(String[] args) {
		
		String str = "Batch 14 is really good";
		
		String[] arr=str.split(" ");
		
		System.out.println(Arrays.toString(arr)); //[Batch, 14, is, really, good]
		System.out.println(arr[4]); //good
		System.out.println(arr[0]); //Batch
		
		
		String str2= "Today is Sunday. Sunday is good day. Java is also  good";
		String[]  arr2= str2.split("[.]");
		System.out.println(Arrays.toString(arr2)); //[Today is Sunday,  Sunday is good day,  Java is also  good]
	}

}
