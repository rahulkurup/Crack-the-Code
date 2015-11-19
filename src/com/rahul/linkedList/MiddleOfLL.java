package com.rahul.linkedList;

public class MiddleOfLL {

	public static void main(String[] args) {
		
		SampleLinkedList ll = new SampleLinkedList(11);
		System.out.println(getMiddle(ll));
	}
	
	
	/**
	 * @param ll
	 * @return
	 */
	public static int getMiddle (SampleLinkedList ll) {

		Node head = ll.getHead();
		
		if(head == null) {
			System.out.println("Not valid Linked List");
			return -1;
		}
		Node slowPointer = head;
		Node fastPointer = head;
		
		while(fastPointer.getNext() != null && fastPointer.getNext().getNext() != null) {
			
			// Make fast pointer jump by two places
			fastPointer = fastPointer.getNext().getNext();
			slowPointer = slowPointer.getNext();
		}
		return slowPointer.getData();
	}
}
