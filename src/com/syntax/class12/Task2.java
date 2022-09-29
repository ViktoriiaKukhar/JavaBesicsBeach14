package com.syntax.class12;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Create a String and if the String is not empty perform the following: if the
		 * String has an odd number of characters and has 3 or more characters, print
		 * the character in the middle of the String.
		 */

		Scanner scn = new Scanner(System.in);
		System.out.println("Please Enter the String");
		String ans = scn.nextLine();

		if (!ans.isEmpty()) {
			if (ans.length() >= 3 && !(ans.length() % 2 == 0)) {
				System.out.println(ans.charAt(ans.length() / 2));
			}
		}

		System.out.println("***************");

		String str = "hello";
		int length = str.length();
		if (!str.isEmpty() && length % 2 != 0 && length >= 3) {

			int middleIndex = length / 2;
			System.out.println(str.charAt(middleIndex));
		}
	}
}
