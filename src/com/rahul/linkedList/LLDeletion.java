package com.rahul.linkedList;

public class LLDeletion {

	
	
	public static void main(String[] args) {
		SampleLinkedList ll = new SampleLinkedList(11);
		delete(ll,5);
		ll.printList();		
	}
	
	/**
	 * @param ll
	 * @param d
	 */
	public static void delete(SampleLinkedList ll, int d) {

		if(ll.getHead() == null) {
			System.out.println("Not Valid");
			return;
		} 

		Node previous = null;
		Node current = ll.getHead();
		if(current.getData() == d) {
			ll.setHead(current.getNext());
			return;
		} else {
			previous = current;
			current = current.getNext();
		}

		while(current !=null) {
			if(current.getData() == d) {
				previous.setNext(current.getNext());
				return;
			} else {
				previous = current;
				current = current.getNext();
			}
		}

	}
}
