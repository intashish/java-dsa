package binary_tree;

public class BinaryTree {
	int value;
	BinaryTree right = null;
	BinaryTree left = null;
	BinaryTree(int value){
		this.value = value;
	}
	@Override
	public String toString() {
		return "BinaryTree [value=" + value + ", right=" + right + ", left=" + left + "]";
	}
	
	
}
