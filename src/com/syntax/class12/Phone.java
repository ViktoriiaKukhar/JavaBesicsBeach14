package com.syntax.class12;

public class Phone {

	/*
	 * Create a Class “Phone”. Create 3 Objects of it: iPhone, Pixel, Samsung with
	 * specific attributes and behaviors.
	 */

	String make;
	String model;
	String color;
	boolean quality;
	int storage;
	int year;

	void makeCall() {
		System.out.println("Making a call using "+model);
	}

	void sendMessage() {
		System.out.println("Send a message");
	}
	
	void browseInternet() {
		System.out.println("Browsing the internet using"+model);
	}

	
}
