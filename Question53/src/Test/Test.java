package Test;

import LinkedList.LinkedListExample;

public class Test {
	public static void main(String[] args) {
		LinkedListExample list = new LinkedListExample();

		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		list.addFirst(40);

		LinkedListExample list2 = new LinkedListExample();

		list2.addFirst(50);
		list2.addFirst(10);
		list2.addFirst(60);
		list2.addFirst(80);
		
		System.out.println(list.findIntersection(list2));
	}
}
