package com.syntax.class13;

import utils.StringUtils;

public class StringDemo2 {

	public static void main(String[] args) {
		
		String str= "Thor love and thunder";
		StringUtils strUtils = new StringUtils(); // we import our own method 
		strUtils.printAllIndexes(str, 'e'); // 8 19 - place, num of index 'e'
		

	}

}
