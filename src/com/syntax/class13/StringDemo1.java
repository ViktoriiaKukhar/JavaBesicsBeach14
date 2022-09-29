package com.syntax.class13;

import java.util.Arrays;

public class StringDemo1 {

	public static void main(String[] args) {
		
		String str="Today is Sunday";
		String day=str.substring(9);
		System.out.println(day); //Sunday
		
		System.out.println(str.substring(6,8)); //is
		
		System.out.println(str.charAt(4)); //y
		char c =str.charAt(4); //calling the method charAt on str object
		System.out.println(c); //y
		
		char[] charArr=str.toCharArray();
		System.out.println(Arrays.toString(charArr)); //[T, o, d, a, y,  , i, s,  , S, u, n, d, a, y]
		//System.out.println(charArr); // Today is Sunday
		
		
		int index=str.indexOf("a");
		System.out.println(index); //3
        System.out.println(str.indexOf("a",6));

	}

}
