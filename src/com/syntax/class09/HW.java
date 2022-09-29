package com.syntax.class09;

public class HW {

	private static int j;

	public static void main(String[] args) {
		// 1. Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.
		
		String[] cars = {"BWM", "Mercedes", "Ford", "Honda", "Ferrari", "Kia"};
		
		for (int i=0; i< cars.length; i++) {
			
			if (i==cars.length-1) {
				System.out.print(cars[i] +".");
			} else {
				System.out.print(cars[i]+", ");
			}
			
			}
		
		
		System.out.println(" ");
		
		for(String car: cars) {
			System.out.print(car+" ");
		}
		
		
		// 2. Create an array of animals and store 5 elements into it. Using 2 different loops print all elements from the array.
		
		System.out.println("----------------");
		String[]animals = {"lama", "lion", "elefant", "monkey", "zebra", "giraffe"};
		
			for (int i=0; i<animals.length; i++) {
				System.out.print(animals[i] +" ");
			}
			
		System.out.println(" ");
		
		for(String animal:animals) {
			System.out.print(animal+" ");
		}

		// 3. Create an array on integers and calculate the sum of all elements in an array
		
		System.out.println("----------------");
		int[] num = {1, 3, 4, 10, 7};
		int sum = 0;
		
		for (int k =0; k <num.length; k++) {
			sum+= num[k];	
		}
		System.out.println("The sum is "+sum);
		
		
		
		System.out.println("----Another way-----");
		sum = 0;
		
		for(int number: num) {
			sum+= number; 
		}
		System.out.println("The sum is "+sum);
		

		// 4. From an array of integer elements find the largest number.
		System.out.println("----------------");
		
		int[] numbers1 = {240, 39, 40, 1000, -100};
		int largestnum = numbers1[0];
		
		for (int i=0; i <numbers1.length; i++) {
			if (numbers1[i]>largestnum) {
				largestnum = numbers1[i];
			}
		}
		System.out.print(largestnum);
		
		
		System.out.println("----Another way-----");
		
		largestnum = numbers1[0];
		
		for(int n:numbers1) {
			
			if(n>largestnum) {
				largestnum=n;
			}
		}
		System.out.print(largestnum);
		
		

		// 5. Create an array to store char values and then print those in reverse order
		System.out.println("----------------");
		
		char[] alf = {'A', 'B', 'C', 'D', 'E', 'F'};
		int letters = alf.length;
		for (int i=letters-1; i>=0; i--) {
			System.out.print(alf[i] +" ");
		}
		 

	}

}
