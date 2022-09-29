package com.syntax.class12;

public class Task3 {

	public static void main(String[] args) {
		/*
		 * Create a String and print it in reverse order (Sunday → yadnuS).
		 */

		String arr = "Friday is the end of the working week";

		int size = arr.length();
		int lasrIndex = arr.length() - 1;

		System.out.println(lasrIndex); // 36
		System.out.println(size);// 37

		for (int i = lasrIndex; i >= 0; i--) {
			System.out.print(arr.charAt(i)); //keew gnikrow eht fo dne eht si yadirF
		}

		
		
		System.out.println("***************");

		String str = "Sunday";

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}

		
		
		System.out.println("----------------");

		char[] charArr = str.toCharArray();
		for (int i = charArr.length - 1; i >= 0; i--) {
			System.out.print(charArr[i]);
		}
	}

}
