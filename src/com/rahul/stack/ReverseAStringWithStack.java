package com.rahul.stack;

import java.util.Stack;

public class ReverseAStringWithStack {

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

		for(char c : input.toCharArray()) {
			stack.push(c);
		}

		StringBuffer output = new StringBuffer();

		while(!stack.isEmpty()) {
			output.append(stack.pop());
		}

		return output.toString();
	}
}
