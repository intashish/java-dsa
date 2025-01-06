package binary_tree;

public class Main {

	public static void preOrder(BinaryTree root) {
		if(root == null) return;
		
		System.out.print(root.value+"-->");
		preOrder(root.left);
		preOrder(root.right);
	}
	public static void inOrder(BinaryTree root) {
		if(root == null) return;
		inOrder(root.left);
		System.out.print(root.value + "-->");
		inOrder(root.right);
	}
	
	public static void postOrder(BinaryTree root) {
		if(root == null) return;
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.value +"-->");
	}
	public static void main(String[] args) {
		
		BinaryTree n1 = new BinaryTree(1);
		BinaryTree n2 = new BinaryTree(2);
		BinaryTree n3 = new BinaryTree(3);
		BinaryTree n4 = new BinaryTree(4);
		BinaryTree n5 = new BinaryTree(5);
		BinaryTree n6 = new BinaryTree(6);
		BinaryTree n7 = new BinaryTree(7);
		BinaryTree n8 = new BinaryTree(8);
		BinaryTree n9 = new BinaryTree(9);
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n4.left = n8;
		n4.right = n9;
		n3.left = n6;
		n3.right = n7;
		
		System.out.println("Pre order traversal");
		preOrder(n1);
		System.out.println();
		System.out.println("In order traversal");
		inOrder(n1);
		
		System.out.println();
		System.out.println("Post order traversal");
		postOrder(n1);
		
	}

}
