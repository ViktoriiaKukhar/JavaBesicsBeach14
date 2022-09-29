package GroupProject01;

public class Task5 {

	public static void main(String[] args) {
		
		/*
		 * Create a 2D array of integers. Develop a program which will calculate
		 *  the sum of even and odd numbers for that array.
		 */

		int[][] arr = {
				
				{11, 22, 5, 8}, {33, 10, 22, 13}, {44, 9, 11, 16}, {2, 6, 34, 7, 60} };
		
		int evenSum = 0;
		int oddSum = 0;
		
		for (int[] ar: arr) {
			
			for(int num : ar) {
				
				if(num%2==0) {
					evenSum+=num;
				}else {
					oddSum+=num;
				}
			}
		}
		System.out.println("Odd Sum "+ oddSum);
		System.out.println("Even Sum "+ evenSum);
	}

}
