package com.syntax.class03;

public class IfElse3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isHungry =true;
		
		if (isHungry) 
			System.out.println("Lets eat something yummy");
		
		if(3>2)
			System.out.println("There isna true satatement inside paranthesis");
		
		
		double myBankBalance=2000;
		double theAmountThatIwantToTransfer=250;
		
		if(myBankBalance> theAmountThatIwantToTransfer)
			System.out.println("Funds trsnsfered succesfuly");
		else
			System.out.println("please try again not enough balance");
		
		
	}

}
