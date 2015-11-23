package com.rahul.linkedList;

/*
 * 
 ***********TEST RESULT*********

				5
				6
				7
				8
				9
				0
				1
				2
				3
				4
 * 
 * *
 */
public class SampleLinkedList {	

	Node head;	


	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	
	/**
	 * @param Create list
	 */
	public SampleLinkedList(int n) {
		Node previous = null;
		
		for(int i = 0 ; i < n ; i++) {
			if(i == 0) {
				 previous = new Node(i);
				 setHead(previous);
			} else {
				Node current = new Node(i);
				previous.setNext(current);		
				previous= current;
			}
		}
	}

	/**
	 * Print List
	 */
	public void printList() {

		Node current = this.getHead();
		while(current != null) {
			System.out.println(current.getData());		
			current = current.getNext();
		}		
	}
}