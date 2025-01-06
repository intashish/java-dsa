package binary_tree;

public class BinaryNode {
	int value;
	BinaryNode right = null;
	BinaryNode left = null;
	BinaryNode(int value){
		this.value = value;
	}
	@Override
	public String toString() {
		return "BinaryTree [value=" + value + ", right=" + right + ", left=" + left + "]";
	}
	
	
}
