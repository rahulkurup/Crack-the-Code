package com.rahul.stack;

import java.util.Stack;

public class ReverseAStringWithStack {

	
	/* Test Result
	 * 
	 * LUHAR
	 * 
	 */

	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		String input = "RAHUL";
		System.out.println(reverse(input));
	}


	/**
	 * @param input
	 * @return
	 */
	public static String reverse(String input) {

		Stack<Character> stack = new Stack<Character>();
		// Go through each character and push into array
		for(char c : input.toCharArray()) {
			stack.push(c);
		}

		StringBuffer output = new StringBuffer();
		
		//Pop all characters and append it into output
		while(!stack.isEmpty()) {
			output.append(stack.pop());
		}

		return output.toString();
	}
}
