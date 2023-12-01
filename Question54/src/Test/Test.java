package Test;

import LinkedList.LinkedListExample;
import LinkedList.Node;

public class Test {
	public static void main(String[] args) {
		LinkedListExample list = new LinkedListExample();

		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		list.addFirst(40);

		list.print();
		System.out.println();
		
		Node nodeReverse = list.reverseLinkedListInPairs();
	
		LinkedListExample listReversePairs = new LinkedListExample(nodeReverse);
		listReversePairs.print();

	}
}
