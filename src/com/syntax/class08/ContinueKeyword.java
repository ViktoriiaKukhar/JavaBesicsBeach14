package com.syntax.class08;

public class ContinueKeyword {

	public static void main(String[] args) {
	
			for (int i =1; i <5; i++) {
			

				if (i==3) {
					continue;
				}
		
				System.out.println("Hello");
				System.out.println("How are you?");
				System.out.println(i);
			}
			
			
			// print numbers from 1 to 20 except number 3,7,8
			
			for (int i=1; i<=20; i++) {
				
				if (i==3 || i==7 ||  i==11) {
					continue;
					
				}
				
				System.out.print(i +" ");
			}
			
			// continue - continues to the next iteration/cycle
			// moment Lava sees continue -> it goes back to the beginning of 
			// it usually used inside some type of conditions 
		
			System.out.println("------------------");
			/* 
			 * Print numbers from 1 to 50 except those that are divisible by 3
			 */
			
			for (int i=1; i<=50; i++) {
				if (i%3 ==0) {
					continue;
				}
				
				System.out.print(i +" "); 
			}
	}

}

