package com.syntax.class04;

import java.util.Scanner;

public class InputFromKeyboard5 {

	public static void main(String[] args) {
	
			Scanner scanner= new Scanner(System.in);
			System.out.println("Did you solve any Repl Assigments please enter true or false");
			boolean solvedAnyRepls= scanner.nextBoolean();
			
			if(solvedAnyRepls)
			{
				System.out.println("How many Repls you solved");
				int noOfRepelsSolved = scanner.nextInt();
				
				if(noOfRepelsSolved>=17)
				{ 
					System.out.println("You are doing great");
					
				}else if(noOfRepelsSolved>10) {
					System.out.println("you are doing ok Please complete them as soon as possible");
				}
				else 
				{
					System.out.println("You should solve some more repls");
				}
				
			}
			else 
			{
				System.out.println("They are very important to learn java please solve them");
			}
			
			
			

			
		}

}
