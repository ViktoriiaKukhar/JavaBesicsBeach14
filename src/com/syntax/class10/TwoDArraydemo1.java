package com.syntax.class10;

public class TwoDArraydemo1 {

	public static void main(String[] args) {
		
		String[][] countries= {
				{"Usa", "Canada"}, // 1 array with index 0
				{"Peru", "Brazil", "Colombia", "Ecuador"}, // 2 array with index 1
				{"Ethiopia", "Egypt", "Keniya"}, // 3 array with index 2
				{"Germany", "Turkiye", "Moldova", "Ukraine"},
				{"Kazakhstan", "Afghanistan", "Korea"}
		};
		
		System.out.println(countries.length); //5 - total # of arrays or rows
		
		int elOf1arr = countries[0].length;
		System.out.println("# of elements for 1 array = "+ elOf1arr);
		
		int elOf2arr = countries[1].length;
		System.out.println("# of elements for 2 array = "+ elOf2arr);
	
		
		System.out.println("--------getting all values from 2d array----------");
		
		for(int r=0; r<countries.length; r++) { //loops over rows 
			
			for (int c=0; c<countries[r].length; c++) { // c - columns 
				
				System.out.print(countries[r][c]+" "); 
			}
			System.out.println(); 
		}
		
		System.out.println("--------Another way---------");
		
		for(String[]country: countries) {
			for (String c:country){
				
			
				if(c.equals("Ukraine")) {
					System.out.println(c +" is my home country"); 
				} else {
					System.out.print(c +" "); 
				}
			System.out.println(); 
			}
		}
		
		
	}

}
