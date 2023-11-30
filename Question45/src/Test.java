
public class Test {
	public static void main(String[] args) {
		/*
		 * Question 45: Implement Queue using Array in java.
		 */

		QueueUsingArray q = new QueueUsingArray(10);

		q.push(10);
		q.push(20);
		q.push(30);
		q.push(40);

		q.print();

		q.pop();

		q.print();

		System.out.println(q.peek());

		q.pop();

		q.print();
		
		q.pop();
		
		System.out.println(q.size());
		q.pop();
		
		System.out.println(q.isEmpty());
	}
}
