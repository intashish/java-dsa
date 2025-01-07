package binary_tree.linkedlist_binary_tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	BinaryNode root;
	BinaryTree() {
		this.root = null;
	}

	void insert(BinaryNode root, int value) {
		BinaryNode newNode = new BinaryNode(value);
		if(root == null) {
			root = newNode;
			return;
		}
		
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			BinaryNode node = queue.remove();
			if(node.left == null) {
				node.left = newNode;
				System.out.println("value added to the left of " + node.value);
				return;
			}else if(node.right == null) {
				node.right = newNode;
				System.out.println("value added to the right of " + node.value);
				return;
			}else {
				System.out.println("adding left value to queue " + node.left.value);
				queue.add(node.left);
				System.out.println("adding right value to queue " + node.right.value);
				queue.add(node.right);
			}
		}
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
