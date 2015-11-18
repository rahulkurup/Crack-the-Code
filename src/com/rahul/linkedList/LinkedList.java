package com.rahul.linkedList;

public class LinkedList {	
	
	Node head;
	
	
	
	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
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

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		ll.setHead(new Node(1));
		Node two = new Node(2);
		Node three = new Node(3);

		// make the Chain
		ll.getHead().setNext(two);
		two.setNext(three);
		three.setNext(null);
		
		//Traverse The LinkedList
		Node current = ll.getHead();
		while(current != null) {
			System.out.println(current.getData());		
			current = current.next;
		}
	}
}
