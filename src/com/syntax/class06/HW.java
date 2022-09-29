package com.syntax.class06;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		/*
		 * Ask user to enter their country and capture it. 
		 * Once values are captured print which language user speaks.
		 */
		
		Scanner in = new Scanner (System.in);
		System.out.println("Please tell me where are you from?");
		
		String country = in.nextLine();
		String language; 
		
		switch(country.toUpperCase()) { 
		case "Ukraine":
			language ="Ukranian";
			break;
		case "USA":
			language ="English";
			break;
		case "Germany":
			language ="German";
			break;
		case "Italy":
			language ="Italian";
			break;
		case "Spain":
			language ="Spanish";
			break;
		default:
			language ="Unknow";
			break;	
		}
		System.out.println("You speak "+ language);
		
		

	}

}
