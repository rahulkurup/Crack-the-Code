package com.rahul.math;


/* Test Case


6 
5

5
6


*/
public class SwapVariableWithOutTemp {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 6;
		
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println(a);
		System.out.println(b);
		
		a = a^b;
		b = a^b;
		a = a^b;
		
				
		System.out.println(a);
		System.out.println(b);
	}
}
