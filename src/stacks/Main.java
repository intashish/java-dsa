package stacks;

public class Main {

	public static void main(String[] args) {

		Stack s = new Stack(1);
		s.push(2);
		
		s.printAllNode();
		System.out.println("popping value - " + s.pop());
		s.printAllNode();
		System.out.println("popping value - " + s.pop());
		s.printAllNode();
		System.out.println("popping value - " + s.pop() );
		s.printAllNode();
	}

}
