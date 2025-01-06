package binary_tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	BinaryNode root;
	BinaryTree() {
		this.root = null;
	}

//	Note: in search binary tree we will use level order traversal
// 	because in other stack we are using stacks and in level order we are using queue and queue is faster then stacks.
	boolean search(BinaryNode root, int value) {
		
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		if(root == null) return false;
		queue.add(root);
		
		while(!queue.isEmpty()) {
			
			BinaryNode currentNode = queue.remove();
			if(currentNode.left != null) {
				queue.add(currentNode.left);
			}
			
			if(currentNode.right != null) {
				queue.add(currentNode.right);
			}
			
			if(value == currentNode.value) {
				return true;
			}
		}
		return false;
	}
	
	public void preOrder(BinaryNode root) {
		if(root == null) return;
		
		System.out.print(root.value+"-->");
		preOrder(root.left);
		preOrder(root.right);
	}
	public void inOrder(BinaryNode root) {
		if(root == null) return;
		inOrder(root.left);
		System.out.print(root.value + "-->");
		inOrder(root.right);
	}
	
	public void postOrder(BinaryNode root) {
		if(root == null) return;
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.value +"-->");
	}
	
	void levelOrder(BinaryNode root) {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		if(root == null) return;
		queue.add(root);
		
		while(!queue.isEmpty()) {
			
			BinaryNode currentNode = queue.remove();
			if(currentNode.left != null) {
				queue.add(currentNode.left);
			}
			
			if(currentNode.right != null) {
				queue.add(currentNode.right);
			}
			
			System.out.print(currentNode.value +" -> ");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
}
