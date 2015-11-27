package com.rahul.stack;

import java.util.Stack;

public class ReverseAStackWithRecursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		for(int i = 0 ; i < 10 ; i++) {
			s.push(i);			
		}
		System.out.println(s.toString());
		reverseStack(s);
		System.out.println(s.toString());
	}

	
	/**
	 * @param s
	 */
	private static void reverseStack(Stack<Integer> s) {
		if(s.isEmpty()) {
			return;
		}
		int element = s.pop();
		reverseStack(s);	
		putElementAtBottomOFStack(s, element);
	}


	/**
	 * @param s
	 */
	private static void putElementAtBottomOFStack(Stack<Integer> s, int element) {
		
		if(s.isEmpty()) {
			s.push(element);
			return;
		}
		
		int temp = s.pop();
		putElementAtBottomOFStack(s, element);
		s.push(temp);		
	}
}
