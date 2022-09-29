package com.syntax.class09;

public class Task {

	public static void main(String[] args) {
		/*
		 * Create an array of chars and store grades into it: A,B,C,D,E,F. Then print a grade B (use 2 different ways of creating an array).
		 */
		char[] alf1 = new char[6];
		alf1[0]='A';
		alf1[1]='B';
		alf1[2]='C';
		alf1[3]='D';
		alf1[4]='E';
		alf1[5]='F';
		System.out.println(alf1[1]);
		
		char[] alf = {'A', 'B', 'C', 'D', 'E', 'F'};
		System.out.println(alf[1]);
		
		
		
		/*
		 * Create an array of names and store all names of your group. Then print your name from that array. 
		 * (use 2 different ways of creating an array).
		 */
		
		String[] name1= new String[4];
		name1[0]= "Vik";
		name1[1]= "Anna";
		name1[2]= "Li";
		name1[3]= "Victoria";
		System.out.println(name1[3]);
		
		String[]name = {"Vik", "Anna", "Li", "Victoria"};
		System.out.println(name[3]);

		
		
		/*
		 * Create an array of words: Java, Saturday, day, coding, is. Print the following sentence 
		 * using elements of array: “Saturday is Java coding Day”.
		 */

		String[]words=new String[5];
		words[0]="Java";
		words[1]= "Saturday";
		words[2]= "Day";
		words[3]= "coding";
		words[4]= "is";
		
		System.out.println(words[1]+" "+ words[4]+" "+ words[0]+" "+ words[3]+" "+ words[2]);
		
	}

}
