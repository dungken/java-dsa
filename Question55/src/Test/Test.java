package Test;

import DoublyLinkedList.DoublyLinkedListExample;
import DoublyLinkedList.Node;

public class Test {
	public static void main(String[] args) {
		DoublyLinkedListExample list = new DoublyLinkedListExample();

		list.addFirst(10);
		list.addFirst(20);

		list.print();

	}
}
