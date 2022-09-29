package com.syntax.class07;

public class HWforLoop {

	public static void main(String[] args) {
		
		// Print numbers from 1 to 100 in 1 line with space
		
		for (int a =1; a <=100; a++) {
			System.out.print(a +" ");
		}

		System.out.println("________________ ");
		//Print numbers from 100 to 1
		for (int b =100; b >=1; b--) {
			System.out.print(b +" ");
		}
		
		System.out.println("________________ ");
		//Print even numbers from 20 to 1 (2 ways)
		for (int c =20; c >=1; c-=2) {
			System.out.print(c +" ");
		}
		
		System.out.println("Another way");
		int d=20;
		while (d <=20 && d >=2) {
			System.out.print(d +" ");
			d-=2;
		}
		
		System.out.println("________________ ");
		//Print odd numbers between 20 and 50 (2 ways)
		for (int f=21; f<=49; f+=2) {
			System.out.print(f +" ");
		}
		
		System.out.println("Another way");
		int i=21;
		
		while (i >=21 && i <=49) {
			System.out.print(i +" ");
			i+=2;
		}
		
		
	}

}
