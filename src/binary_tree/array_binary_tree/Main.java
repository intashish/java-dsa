package binary_tree.array_binary_tree;

public class Main {

	public static void main(String[] args) {
		BinaryTreeArray bt = new BinaryTreeArray(9);
		bt.insert(1);
		bt.insert(2);
		bt.insert(3);
		bt.insert(4);
		bt.insert(5);
		bt.insert(6);
		bt.insert(7);
		bt.insert(8);
		bt.insert(9);
//		bt.print();
		System.out.println("Pre order traversal");
		bt.preOrder(1);
		
		System.out.println();
		System.out.println("In order traversal");
		bt.inOrder(1);
		
		System.out.println();
		System.out.println("Post order traversal");
		bt.postOrder(1);
	}
	

}
