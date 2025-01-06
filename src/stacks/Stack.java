package stacks;

public class Stack {

	public Node top;
	public int height;
	
	class Node{
		int value;
		Node next = null;
		
		public Node(int value) {
			this.value = value;
		}
	}
	
	public Stack(int value) {
		Node node = new Node(value);
		this.top = node;
		height = 1;
	}
	
	public void push(int value) {
		Node node = new Node(value);
		node.next = this.top;
		this.top = node;
		this.height++;
	}
	
	public int pop() {
		if(this.top == null) return 0;
		Node node = this.top;
		this.top = this.top.next;
		this.height--;
		return node.value;
	}
	
	public void printAllNode() {
		if(this.top == null) System.out.println("null");
		Node node = this.top;
		while(node != null) {
			System.out.println(node.value);
			node = node.next;
		}
	}
	
}
