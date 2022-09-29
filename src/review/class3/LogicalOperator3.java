package review.class3;

public class LogicalOperator3 {

	public static void main(String[] args) {
		
		double saving=200000;
		boolean freeTime=true;
		String season="Summer";
		
		if(saving>100000 && freeTime && season.equals("Summer")) {
			System.out.println("Lets go to Bora Bora");
		}else {
            System.out.println("I need time and money");
        }
		
	}

}
