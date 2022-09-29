package com.syntax.class06;

import java.util.Scanner;

public class EnhancedCode {

	public static void main(String[] args) {

		Scanner time = new Scanner(System.in);
		
		System.out.println("What time is it? Use 24 hour format");
		int hours = time.nextInt();
		
		String timeOfTheDay;
		
		if (hours>=1 && hours <=11) {
			timeOfTheDay= "Morning";
		}
		else if (hours>=12 && hours <=15) {
			timeOfTheDay= "Afternoon";
		}
		else if (hours>=16 && hours <=20) {
			timeOfTheDay= "Evning";
		}
		else if (hours>=21 && hours <=24) {
			timeOfTheDay= "Night";
		}
		else {
			System.out.println("Wrong number is entered");
			timeOfTheDay= "Invalid";
		}
	
		System.out.println(timeOfTheDay);
		


	}

}
