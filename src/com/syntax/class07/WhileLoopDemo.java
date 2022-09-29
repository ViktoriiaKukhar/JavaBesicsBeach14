package com.syntax.class07;

public class WhileLoopDemo {

	public static void main(String[] args) {
		int time=10;
		
		if (time<12) {
			System.out.println("Good morning inside if");
		}

		/*
		 * infinite loop
		 * 
		 * while (time<12) {
		 * System.out.println("Good morning");
		 */
		
		while (time<12) {
			System.out.println("Good morning inside while loop");
			time++;
		}
	}

}
