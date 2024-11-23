package com.dsa.linkedlist;

public class LinkList {
	Node head = null;
	Node tail = null;
	int length;

	public LinkList(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length++;
	}

	public void append(int value) {
		Node node = new Node(value);
		if (head == null) {
			head = node;
		}
		tail.next = node;
		tail = node;
		length++;
	}

	public void removeFirstNode() {
		if (length == 0) { // cover the edge case -- if there is only one node then what?
			head = null;
			tail = null;
		}
		head = head.next;
		length--;
	}

//    public void prepend(){}

	// check out the edge case -- if there is only one node
	public void removeLastNode() {
		Node currentNode = head;
		while (currentNode.next.next != null) { // this will give error if there is only one node. Since there is no
												// next of next node.
			currentNode = currentNode.next;
		}
		tail = currentNode;
		tail.next = null;
		length--;
		if (length == 0) { // this is for edge case if there is only one node.
			head = null;
			tail = null;
		}
	}

	public void printNode() {
		Node currentNode = head;
		while (currentNode != null) {
			System.out.println(currentNode.value);
			currentNode = currentNode.next;
		}
		System.out.println("\n");
	}

	public Node slowPointer = null;
	public Node fastPointer = null;

	public Node findMiddleNode() {
		if (head == tail)
			return head;
		slowPointer = head;
		fastPointer = head;
		while (fastPointer.next != null) {
			slowPointer = slowPointer.next;
			// if odd length
			if (fastPointer.next != null && fastPointer.next.next != null) {
				fastPointer = fastPointer.next.next;
			} else if (fastPointer.next != null) {
				break;
			}
		}

		return slowPointer;
	}

	//not coded properly
	public boolean hasLoop() {
		if (head == tail)
			return true;
		slowPointer = head;
		fastPointer = head;
		
		while(fastPointer.next != null) {
			System.out.println(slowPointer.value+" "+fastPointer.value);
			slowPointer = slowPointer.next;
			if(fastPointer.next != null && fastPointer.next.next != null) {
				fastPointer = fastPointer.next.next;
			}
			if(fastPointer.next.next == null) {
				return false;
			}
			
			if(slowPointer == fastPointer) {
				System.out.println(slowPointer.value+" "+fastPointer.value);
				return true;
			}
		}
		return false;
	}

	public class Node {
		public int value;
		Node next = null;

		Node(int value) {
			this.value = value;
		}
	}

}
