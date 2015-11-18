package com.rahul.linkedList;


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
			current = current.next;
		}		
	}


	static class Node {

		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}		

	}
}