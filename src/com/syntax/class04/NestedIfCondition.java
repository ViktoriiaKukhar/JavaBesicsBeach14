package com.syntax.class04;

public class NestedIfCondition {

	public static void main(String[] args) {
	
		
		
		int time=5;
		String day="Monday";
		
		/*
		 * it is called outer if-condition if it is true then only inner conditions will be checked 
		 * if it is false nothing from inner if condition will be executed it is like the main door
		 * if main door is closed we can't enter the building 
		 */
		
		
		//Outer if-condition
		
		if(day.equals("Monday"))  // as String is a non primitive, we can't use == sign we have to use .equals method 
		{
			if(time>7)
			{
				System.out.println("Lets go to office");
			}
			if(time<6) 
			{
				System.out.println("Lets sleep more");
			}
			
			
		}
		
		
		/*
		 * 
		 */
		
		
		double moneyInMyAccount=2000;
		String season="Spring";
		
		if(season.equals("Spring"))
		{
			
			
			if(moneyInMyAccount>30000)
			{
				System.out.println("let's go vacations");
			}
			else
			{
				System.out.println("I need to save more");
			}
		}
		
		
		
		
	}
				
	}


