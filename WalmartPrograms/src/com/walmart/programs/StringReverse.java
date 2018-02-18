package com.walmart.programs;

/**
 * 
 * @author zeesh
 *
 */
public class StringReverse {

	public static void main(String[] args) {
		System.out.println(reverseStr("walmart"));
	}
	
	/**
	 *  
	 * @param input
	 * @return
	 * 
	 * Following Method uses recursion to reverse a String in Java. last character of input string is added to return
	 * in addition to that it recursively calls original method for rest of the string
	 */
	private static String reverseStr(String input){
		if(input == null || input.length()==1) return input;
		return input.substring(input.length()-1) +  reverseStr(input.substring(0, input.length()-1));
	}

}
