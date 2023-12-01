package Test;

import LinkedList.LinkedListExample;

public class Test {
	public static void main(String[] args) {
		LinkedListExample list = new LinkedListExample();
		
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		
		list.print();
		
		System.out.println();
		
		System.out.println(list.findMiddleElement1());
		System.out.println(list.findMiddleElement2());
	}
}
