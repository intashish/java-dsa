package queue;

public class Queue {

	public Node first;
	public Node last;
	
	class Node{
		public int value;
		public Node next = null;
		
		public Node(int value) {
			this.value = value;
		}	
	}
	
	public Queue(int value) {
		Node node = new Node(value);
		this.first = node;
		this.last = node;
	}
	
	public void enqueue(int value) {
		Node node = new Node(value);
		this.last.next = node;
		this.last = node;
	}
	
	public int dequeue() {
		if(this.first == null) return 0;
		Node node = this.first;
		this.first = this.first.next;
		return node.value;
	}
	
	void printAllNode() {
		if(this.first == null) System.out.println("empty");
		Node node = this.first;
		while(node != null) {
			System.out.println(node.value);
			node = node.next;
		}
	}
}
