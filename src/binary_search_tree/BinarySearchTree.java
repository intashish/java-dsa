package binary_search_tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
	BinaryNode root;
	
	public BinarySearchTree() {
		root = null;
	}
	
	private BinaryNode insert(BinaryNode currentNode, int value) {
		if(currentNode == null) {
			BinaryNode newNode = new BinaryNode(value);
			return newNode;
		}else if(value < currentNode.value) {			
			currentNode.left = insert(currentNode.left, value);
			return currentNode;
		}else if(value > currentNode.value) {
			currentNode.right = insert(currentNode.right, value);
			return currentNode;
		}
		return null;
	}
	
	public void insert(int value) {
		root = insert(root,value);
	}

	//root -> left -> right
	public void preOrder(BinaryNode currentNode) {
		if(currentNode == null) {
			return;
		}
		System.out.print(currentNode.value+" ");
		preOrder(currentNode.left);
		preOrder(currentNode.right);
	}
	
	//left -> root -> right
	public void inOrder(BinaryNode currentNode) {
		if(currentNode == null) {
			return;
		}
		inOrder(currentNode.left);
		System.out.print(currentNode.value + " ");
		inOrder(currentNode.right);
	}
	
	//left -> right -> root
	public void postOrder(BinaryNode currentNode) {
		if(currentNode == null) {
			return;
		}
		postOrder(currentNode.left);
		postOrder(currentNode.right);
		System.out.print(currentNode.value + " ");
	}
	
	void levelOrder() {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			BinaryNode node = queue.remove();
			if(node.left != null) queue.add(node.left);
			if(node.right != null) queue.add(node.right);
			System.out.println(node.value);
		}
	}
	
	boolean search(int value) {
		BinaryNode node = root;
		while(node != null) {
			if(value == node.value) {
				return true;
			}else if(value < node.value) {
				node = node.left;
			}else if(value > node.value) {
				node = node.right;
			}
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
