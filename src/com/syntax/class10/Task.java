package com.syntax.class10;

public class Task {

	public static void main(String[] args) {
	/* Create a 2D array (longer way)where you will store the following values: Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
	 * After storing values print following String:
	 * Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan. 
	 */
		
			String[][] bigArr = new String[2][4];
			//1 row
			bigArr[0][0]="Mr.";
			bigArr[0][1]="Mrs.";
			bigArr[0][2]="Miss.";
			bigArr[0][3]="Ms.";
			//2 row
			bigArr[1][0]="Smith";
			bigArr[1][1]="Jordan";
			bigArr[1][2]="Jackson";
			bigArr[1][3]="Obama";
			
			System.out.println(bigArr[0][1]+" "+bigArr[1][0]+", "+bigArr[0][0]+" "+bigArr[1][3]+", "+bigArr[0][3]+" "+bigArr[1][2]+", "+bigArr[0][2]+" "+bigArr[1][1]+".");
			

			
			
			String[][] names = {
				{"Mr", "Mrs", "Ms", "Mis"},
				{"Smith", "Jordan", "Jackson", "Obama"}
				};
		
			System.out.println(names[0][1]+" "+names[1][0]+", "+ names[0][0]+" "+names[1][3]+", "+ names[0][2]+" "+names[1][2]+", "+names[0][3]+" "+names[1][1]); 
	
	
	/*
	 * Create a 2D array(shorter way) in which first array will consist of 4 names and second array will contain grades.
	 * Then your program should print name of the students that has A and B grade
	 */
	
			String[][] arr1= {

                    {"Yusuf", "Hamza", "Adam", "John"},
                    {"A", "B", "C", "D"}
            		};

            System.out.println(arr1[0][0]+"="+arr1[1][0]);
            
            System.out.println(arr1[0][1]+"="+arr1[1][1]);
            
            System.out.println(arr1[0][2]+"="+arr1[1][2]);
            
            System.out.println(arr1[0][3]+"="+arr1[1][3]);
    		
	
            for (int i=0; i<arr1.length; i++) {
				for (int j=0; j<arr1[i].length; j++) {
					
					System.out.print(arr1[i][j]+" ");
				}
				System.out.println();
			}
	
            
            System.out.println("-----Another way-------");
            
            for(String[] singleArray: arr1) {
            	
            	for(String el:singleArray) {
            		
            		System.out.print(el+" ");
            	}
            }
	}

}
