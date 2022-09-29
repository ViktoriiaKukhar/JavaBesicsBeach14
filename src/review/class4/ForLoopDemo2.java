package review.class4;

import java.util.Scanner;

public class ForLoopDemo2 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number");
		int i = scanner.nextInt();
		
		while(i!=10) {
		System.out.println(i);
		i=scanner.nextInt();
		}
		
		/*
		 * while (i!=10) {
		 * System.out.println(i);
		 * i=scanner.nextInt();
		 * }
		 * 
		 * 
		 * all the 
		 */
		
		for (int k=0; i!=10; k++) {
			System.out.println(i);
			i=scanner.nextInt();
		}

	}

}
