package GroupProject01;

public class Task4 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array or integer type where you will store odd and even numbers. 
		 * Develop a program which will identify/print the even numbers only.
		 */
		
		int[][] arr = {
				
				{11, 22, 5, 8}, {33, 10, 22, 13}, {44, 9, 11, 16}, {2, 6, 34, 7, 60} };
		
		int sum = 0;
		
		for (int[] ar: arr) {
			
			for(int num : ar) {
				
				if(num%2==0) {
					System.out.println(num);
				}
			}
		}
		
	}

}
