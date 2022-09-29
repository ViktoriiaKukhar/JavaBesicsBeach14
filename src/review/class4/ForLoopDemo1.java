package review.class4;

public class ForLoopDemo1 {

	public static void main(String[] args) {
		
		for(int i=0; i!=3; i++) {
			System.out.println(i);
		}
	
		
		System.out.println("------------------");
		//  print this pattern  10 8  6 4  2 0
		for  (int i=10; i>=0; i-=2) {
			System.out.println(i);
		}
		
		
		System.out.println("------------------");
		// 9 5 1 
		for (int i=9; i>=1; i-=4) {
			System.out.println(i);
		}
		
		
		System.out.println("------------------");
		//1 3 7 9 
		for (int i=1; i<=9; i+=2) {
			
			if (i!=5) {
				System.out.println(i);
			}
		}
	}

}
