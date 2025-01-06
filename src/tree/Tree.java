package tree;

import java.util.ArrayList;

public class Tree {

	String value;
	ArrayList<Tree> children;
	
	public Tree(String value) {
		this.value = value;
		this.children = new ArrayList<Tree>();
	}
	
	public void add(Tree node) {
		this.children.add(node);
	}
	
	public String print(int level) {
		String ret;
		ret = "  ".repeat(level)+value+"\n";
		for(Tree node : this.children) {
			ret += node.print(level+1);
		}
		
		return ret;
//		System.out.println(this.value);
//		if(this.children.isEmpty()) return ;
//		for(Tree n : this.children) {
//			print();
//		}
	}

	
}
