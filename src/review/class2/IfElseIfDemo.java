package review.class2;

public class IfElseIfDemo {

	public static void main(String[] args) {
		/*
		 * if we need one outcome based on if conditions we use if if 
		 * the outcome are two use if else if outcome are more that that we can use if else if 
		 * whenever you have to check more then two conditions always use if else if conditions
		 */
		
		int number = 0;

        if (number > 0) {
            System.out.println("number is positive");
        }
        if (number < 0) {
            System.out.println("number is negative");
        }
        if (number == 0) {
            System.out.println("number is 0");
        }
        
        
        //better one************************Second Program**************************
        if (number > 0) 
        {
            System.out.println("number is positive");
        } 
        else if (number < 0) 
        {
            System.out.println("number is negative");
        }
        else 
        {
            System.out.println("number is 0");
        }
        
        
        
        
 
            
            int number1=30;
            
            if(number1==10) {
                System.out.println("nunmber is 10");
            }
            else if (number1==20)
            {
                System.out.println("nunmber is 20");
            }
            else if (number1==30)
            {
                System.out.println("nunmber is 30");
            }
            else
            {
            	System.out.println("Number is not valid");
            }

     
        
	}

}
