package GroupProject01;

public class Task6 {

	public static void main(String[] args) {
		
		//  Write a program to swap 2 numbers without a temporary variable?
		
		int a=10;
		int b=20;
		
		a = a+ b; // a= 30
		b = a- b; // 30- b(20) = 10
		a = a- b; // 30- 10 = 20
		
		System.out.println("a =  " + a);
		System.out.println("b =  " + b);

	}

}
