package com.syntax.class05;

public class Recap {

	// shortcut to autocomplele; ctrl+space

	public static void main(String[] args) {

		String phone = "Samsung";

		if (phone.equals("iPhone")) {
			System.out.println("I want to buy it for me");
		} else if (phone.equals("Samsung")) {
			System.out.println("I want to buy it for my husband");
		} else if (phone.equals("Nokia")) {
			System.out.println("I want to buy it for my grandma");
		} else {
			System.out.println("That is not the phone I was looking for");
		}

		// to format your cod
		// command + shift + f

		boolean allergy = true;
		String allergyType = "pollen";

		if (allergy) {
			System.out.println("Let's check what allergy you have");

			if (allergyType.equalsIgnoreCase("Pollen")) {
				System.out.println("Try to stay indoor");
			} else if (allergyType.equals("Peanut")) {
				System.out.println("Try to stay away from peanuts");
			} else {
				System.out.println("We need to do some test");
			}
		} else {
			System.out.println("You are lucky");
		}
	}

}
