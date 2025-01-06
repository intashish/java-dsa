package binary_tree;

public class Main {

	
	public static void main(String[] args) {
		
		BinaryTree bt = new BinaryTree();
		BinaryNode n1 = new BinaryNode(1);
		BinaryNode n2 = new BinaryNode(2);
		BinaryNode n3 = new BinaryNode(3);
		BinaryNode n4 = new BinaryNode(4);
		BinaryNode n5 = new BinaryNode(5);
		BinaryNode n6 = new BinaryNode(6);
		BinaryNode n7 = new BinaryNode(7);
		BinaryNode n8 = new BinaryNode(8);
		BinaryNode n9 = new BinaryNode(9);
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n4.left = n8;
		n4.right = n9;
		n3.left = n6;
		n3.right = n7;
		
		System.out.println("Pre order traversal");
		bt.preOrder(n1);
		System.out.println();
		System.out.println("In order traversal");
		bt.inOrder(n1);
		
		System.out.println();
		System.out.println("Post order traversal");
		bt.postOrder(n1);
		
//		Tree representation of data for better understanding
//								 1
//						        / \
//						       2   3
//						      / \   \
//						     4   5   6
//						    / \       \
//						   8   9       7
		
	}

}
