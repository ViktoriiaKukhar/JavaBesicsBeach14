package com.syntax.class07;

import java.util.Scanner;

public class HWTask5 {

	public static void main(String[] args) {
		// Prompt the user to ask the name 3 times and print "Good afternoon + name...
		
		Scanner sc = new Scanner(System.in);
	
		
		for (int a =1; a <=3; a++) {
			System.out.println("Please write a name");
			String name = sc.nextLine();
			System.out.println("Good afternoon " + name);
		}
			

	}

}
