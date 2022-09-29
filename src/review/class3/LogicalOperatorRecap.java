package review.class3;

public class LogicalOperatorRecap {

	public static void main(String[] args) {
		
		boolean programmer=false;
		boolean manualTester=true;
		
		if (programmer && manualTester) {
			System.out.println("You can be an automation engineer");
		} else {
			System.out.println("You must know a programming language and manual testing"+ " to be an automation engineer");
		}

	}

}
