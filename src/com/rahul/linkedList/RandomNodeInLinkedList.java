package com.rahul.linkedList;

public class RandomNodeInLinkedList {

	private static SampleLinkedList ll = new SampleLinkedList(20);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(getRandomNode());
		

	}


	/**
	 * @return
	 */
	private static int getRandomNode() {
		
		Node current = ll.getHead();
		int count = 0;
		
		while(current != null) {
			count++;
			current = current.getNext();
		}
		
		int random = (int)Math.random() * count;
		
		int i = 0;
		current = ll.getHead();

		while(i < random) {
			current = current.getNext();
		}
		return current.getData();
	}
}