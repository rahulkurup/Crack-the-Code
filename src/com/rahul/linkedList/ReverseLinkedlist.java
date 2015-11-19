package com.rahul.linkedList;

public class ReverseLinkedlist {

	private static SampleLinkedList ll = new SampleLinkedList(10);

	public static void main(String[] args) {

		ll.printList();
		ll.setHead(reverseList(ll.getHead()));
		ll.printList();
	}


	/**
	 * Reverse the LinkedList
	 * @param node 
	 */
	public static Node reverseList(Node node) {

		if(node == null || node.getNext() == null) {
			return node;
		}

		Node next = node.getNext();
		node.setNext(null);
		Node head = reverseList(next);
		next.setNext(node);

		return head;
	}
}