package com.syntax.class12;

public class StringDemo8 {

	public static void main(String[] args) {
		
		String str=  "Batch 14 is good (35364758 ADFGSHSJ ahdjhadlfja)";
		
		System.out.println(str.replace("good", "Excellent")); // Batch 14 is Excellent
		System.out.println(str); // Batch 14 is good
		
		System.out.println(str.replaceAll("[a-z]", "")); // B 14   (35364758 ADFGSHSJ )
		System.out.println(str.replaceAll("[a-z]", "#")); // B#### 14 ## #### (35364758 ADFGSHSJ ###########)
	}

}
