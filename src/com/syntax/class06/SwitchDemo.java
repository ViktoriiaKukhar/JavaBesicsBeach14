package com.syntax.class06;

public class SwitchDemo {

	public static void main(String[] args) {
		
		int number=19;
		
		if (number!=18) //  not = to
			{
			System.out.println("this is number is not 18");
			}
		
		int day=5;
		
		if(day== 1){
			System.out.println("Monday");
		} else if (day==2){
			System.out.println("Tuersday");
		}else if (day==3){
			System.out.println("Wednesday");
		}else if (day==4){
			System.out.println("Thursday");
		}else if (day==5){
			System.out.println("Friday");
		}else if (day==6){
			System.out.println("Saturday");
		}else if (day==7){
			System.out.println("Sunday");
		}else {
			System.out.println("Please enter a valid day number(1-7)");
		}
		
		/*
		 * switch case is values based
		 * it knows the values -> jump into matching case
		 */
		
		System.out.println("_________________________");
		
		String name;
		
		switch (day) {
		case 1:
			name= "Monday";
			break;
		case 2:
			name= "Tuesday";
			break;
		case 3:
			name= "Wednesday";
			break;
		case 4:
			name= "Thursday";
			break;
		case 5:
			name= "Friday";
			break;
		case 6:
			name= "saturday";
			break;
		case 7:
			name= "Sanday";
			break;
		default:
			name= "Invalid";
			break;
		}
		System.out.println(name);

	}

}
