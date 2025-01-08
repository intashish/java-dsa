package binary_tree.array_binary_tree;

public class BinaryTreeArray {

	Integer[] arr;
	int lastUsedIndex;
	
	public BinaryTreeArray(int size) {
		arr = new Integer[size+1];
		lastUsedIndex = 0;
		System.out.println("array of size "+ size +" is created");
	}
	
	//helper method to check if array is full or not
	boolean isFull() {
		if(lastUsedIndex == arr.length-1) {
			return true;
		}
		return false;
	}
	
	void insert(int value) {
		
		if(!isFull()) {
			arr[lastUsedIndex+1] = value;
			lastUsedIndex++;
			System.out.println("value inserted at index "+ lastUsedIndex);
		}
	}
	
	//root -> left -> right
	void preOrder(int index) {
		if(index > lastUsedIndex) return;
		
		System.out.print(arr[index]+ " -> ");
		preOrder(2 * index);
		preOrder(2 * index + 1);
	}
	
	//left -> root -> right
	void inOrder(int index) {
		if(index > lastUsedIndex) return;
		
		inOrder(2 * index);
		System.out.print(arr[index] + " -> ");
		inOrder(2 * index + 1);
		
	}
	
	//left -> right -> root
	void postOrder(int index) {
		if(index > lastUsedIndex) return;
		
		postOrder(2 * index);
		postOrder(2 * index + 1);
		System.out.print(arr[index] + " -> ");
		
	}
	
	//Search node
	int search(int value) {
		if(lastUsedIndex == 0) {
			return -1;
		}
		
		for(int i = 1; i <= lastUsedIndex; i++ ) {
			if(arr[i] == value) {
				return i;
			}
		}
		return -1;
	}
	
	//Delete Node
	void delete(int value) {
		int index = search(value);
		if(index == -1) {
			System.out.println("node does not exit");
			return;
		}
		arr[index] = arr[lastUsedIndex];
		lastUsedIndex--;
		System.out.println("deleted the node");
	}
	
	void leveOrder() {
		for(int i = 1; i <= lastUsedIndex; i++) {
			System.out.print(arr[i] + " -> ");
		}
	}
	
}
