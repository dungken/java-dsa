import LinkedList.LinkedListExample;

public class Example {
	public static void main(String[] args) {
		/*
		 * Implement singly linked list in java addFirst() addLast() removeFirst()
		 * removeLast() size() addMiddle() removeMiddle()
		 */

		LinkedListExample list = new LinkedListExample();

		list.addFirst(10);
		list.addFirst(20);
		list.addLast(50);
		list.addLast(60);
		list.addMiddle(4, 2);
		
		list.print();
		System.out.println();
		list.removeMiddle(0);
		
//		System.out.println(list.size());
		list.print();
	}
}
