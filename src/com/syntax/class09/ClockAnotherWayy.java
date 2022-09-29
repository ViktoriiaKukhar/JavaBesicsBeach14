package com.syntax.class09;

public class ClockAnotherWayy {

	public static void main(String[] args) {
		
		  String time=null;

	        for (int h = 0; h <= 23; h++) {

	            for (int m = 0; m <= 59; m++) {

	                if(h<10 && m<10) {
	                    time="0"+h+":"+"0"+m;

	                } else if (h<10 && m>=10) {
	                    time="0"+h+":"+m;

	                } else if(h>=10 && m<10) {
	                    time=h+":"+"0"+m;

	                } else {
	                    time=h+":"+m;
	                }

	                System.out.println(time);
	            }
	        }
	        
	        
	        
		
		for (int h1=0; h1<=2; h1++) {
			
			for (int h2=0; h2<=9; h2++) {
				
				if (h1==2 && h2 ==4) 
				{
					break;
				}
				
				for (int m1=0; m1<=5; m1++) {
					
					for (int m2=0; m2<=9; m2++) {
						 
						System.out.println(h1 + "" + h2 + ":" + m1 + "" +m2);
					}
				}
			}
		}
		
		
		// better way
		
		   for (int h = 0; h < 24; h++) {  //controls hours

	            for (int m1 = 0; m1 <= 5; m1++) { // controls first digit of min 

	                for (int m2 = 0; m2 <= 9; m2++) {  // controls 2nd digit of min 

	                    if (h < 10) {
	                        System.out.println("0" + h + ":" + m1 + m2);
	                    } else {
	                        System.out.println(h + ":" + m1 + m2);
	                    }
	                }
	            }
	        }
		

	}

}
