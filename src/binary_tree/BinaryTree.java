package binary_tree;

public class BinaryTree {

	BinaryNode node;
	BinaryTree() {
		this.node = null;
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
}
