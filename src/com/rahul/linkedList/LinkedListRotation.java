package com.rahul.linkedList;

public class LinkedListRotation {

	
	private static SampleLinkedList ll = new SampleLinkedList(10);
	
	
	public static void main(String[] args) {
		
		rotator(ll.getHead(), 5);
		ll.printList();
	}
	
	// Rotate LL by K
	public static void rotator(Node head, int k) {
		
		Node current = head;
		int count = 1;
		Node tempHead = null;
		Node next = null ;
		
		while(current!= null & count < k) {
			count++;
			current = current.getNext();			
		}
		
		if(count == k & current != null) { // We have enough nodes
			if(current.getNext() != null) {
				next = current.getNext();
				tempHead = head;
				head = next;
				current.setNext(null);	
				while(next.getNext() != null) {	
					next = next.getNext();
				}
				next.setNext(tempHead);				
			}
		} else {
			return; // No enough elements to rotate
		}	
		
		ll.setHead(head);
	}
}