package com.syntax.class07;

public class WhileLoopsTask {

	public static void main(String[] args) {
		
		// Print numbers from 100 to 1
		
		int a=100;
		while (a<=100 && a>0) {
			System.out.print(a+ " ");
			a--;
		}

		System.out.println("________________ ");
		//Print even numbers from 20 to 100 
		
		int b=20;
		while (b>=20 && b<=100) {
			System.out.print(b+ " ");
			b++;
		}
		
		System.out.println("________________ ");
		//Print only odd numbers from 100 to 1 (2 different ways)
		
		int c= 99;
		while(c<=99 && c>0) {
			System.out.print(c+ " ");
			c-=2;
		}
		
		System.out.println("Another way");
		int d=99;
		while(d>=1) {
			if (d%2!=0) 
			{
				System.out.print(d+ " ");
			}
		d--;
		}

	}
	
}
