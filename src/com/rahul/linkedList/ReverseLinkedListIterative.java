package com.rahul.linkedList;

public class ReverseLinkedListIterative {

	private static SampleLinkedList ll = new SampleLinkedList(10);

	public static void main(String[] args) {

		ll.setHead(reverseList(ll.getHead()));
		ll.printList();
	}


	/**
	 * Reverse the LinkedList
	 * @param node 
	 */
	public static Node reverseList(Node head) {
		

		if(head == null) {
			return null;
		}
		
		Node previous = null;
		Node current = head;
		Node next = current.getNext();
		
		while(next != null) {
			next = current.getNext();
			current.setNext(previous);
			previous = current;
			current = next;		
		}
		
		return previous;
	}
}