package binary_search_tree;

public class Main {

	public static void main(String[] args) {
		
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(70);
		bst.insert(50);
		bst.insert(90);
		bst.insert(30);
		bst.insert(60);
		bst.insert(80);
		bst.insert(100);
		bst.insert(20);
		bst.insert(40);
		
//		bst.preOrder(bst.root);
//		bst.inOrder(bst.root);
//		bst.postOrder(bst.root);  
//		bst.levelOrder();
		System.out.println(bst.search(40));
		//Current Tree diagram
//								70
//							50		90
//						30	   60 80	100
//					20		40
	}

}
