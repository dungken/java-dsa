package Test;

import LinkedList.LinkedListExample;

public class Test {
	public static void main(String[] args) {
		LinkedListExample list = new LinkedListExample();
		
		list.addLast(1);
		list.addLast(2);
		list.addLast(1);
		list.addLast(2);
		list.addLast(2);
	
		
		list.print();
		
		System.out.println();
		
		System.out.println(list.isPlindrome());
	}
}
