package com.syntax.class10;

public class GroupProject {

	public static void main(String[] args) {
		/*
		 * Task 4
		 * 
		 * Create a 2D array or integer type where you will store odd and even numbers. 
		 * Develop a program which will identify/print the even numbers only.
		 */
		
		int[][] numbers = {
				{11, 22, 5, 8},
				{33, 10, 22, 13},
				{44, 9, 11, 16},
				{2, 6, 34, 7, 60}
		};
		
		for (int r=0; r<numbers.length; r++) {
			
			for (int c=0; c<numbers[r].length; c++) {
				
				if(numbers[r][c]%2==0) 
				{
					System.out.print(numbers[r][c] +" ");
				}
			}
		}

		System.out.println("________________ ");
		//Print even numbers from 1 to 50 (2 ways)
		for (int c =1; c <=50; c++) {
			
			if (c%2==0) 
			{
				System.out.print(c +" ");
			} 
		}
		
		
		System.out.println("Another way");
		int d=1;
		while (d >=1 && d <=50) {
			
			if (d%2==0) 
			{
				System.out.print(d +" ");
			}
			d++;
		}
		
		/* System.out.println("Another way");
		for (int c=0; c<numbers.length; c++) {
			
			for(int r=0; r<numbers[c].length; r++) {
				
				if(numbers[r][c]%2==0)
				{
					System.out.print(numbers[r][c]+" ");
				}
			}	
		}*/

		
	}

}
