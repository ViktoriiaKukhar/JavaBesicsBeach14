package com.syntax.class12;

public class PhoneTester {

	public static void main(String[] args) {
		/*
		 * If class whose object we are creating is present inside the same package we don't need to import it.
		 */

		Phone iphone=new Phone();
		
		iphone.make = "Apple";
		iphone.model = "Iphone 12";
		iphone.color = "Purpel";
		iphone.storage = 128;
		iphone.year = 2021;
		iphone.makeCall();
		
		
		// new Phone() -> To Create the object
		Phone samsungPhone=new Phone();
		
		samsungPhone.model="S22 Ultra";
		samsungPhone.make="Samsng";
		samsungPhone.year=2022;
		samsungPhone.makeCall();
		
		
		
	}

}
