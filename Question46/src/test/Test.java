package test;

import implement.QueueUsingLinkedList;

public class Test {
	public static void main(String[] args) {
		/*
		 * 
		 */
		
		QueueUsingLinkedList q = new QueueUsingLinkedList();
		
		q.push(10);
		q.push(20);
		q.push(30);
		
		q.pop();
		q.pop();
		System.out.println(q.peek());
		q.pop();
		
		System.out.println(q.size());
		System.out.println(q.isEmpty());
		q.print();
	}
}
