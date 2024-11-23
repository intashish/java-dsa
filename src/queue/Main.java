package queue;

public class Main {

	public static void main(String[] args) {

		Queue q = new Queue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.printAllNode();
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
//		q.printAllNode();
	}

}
