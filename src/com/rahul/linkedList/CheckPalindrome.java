package com.rahul.linkedList;

public class CheckPalindrome {
	
	private static SampleLinkedList ll = new SampleLinkedList(1);
	
	
	
	public static void main( String[] args) {
		
		if(isPalindrome(ll.getHead(), ll.getHead())) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}		
	}
	
	
	public static boolean isPalindrome(Node left, Node right) {
		
		boolean returner = false;
		if(right == null) {
			return true;
		}
		
		/*Check the sublist */
		if(!isPalindrome(left, right.getNext())) {
			return false;
		}
		
		if(left.getData() == right.getData()) {
			returner = true;
		} else {
			returner = false;
		}
		
		left = left.getNext();
		
		return returner;
	}
}