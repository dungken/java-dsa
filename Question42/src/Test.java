
public class Test {
	public static void main(String[] args) {
		/*
		 * Question 42: Implement a stack using Linked List.
		 * 
		 * push() -> add first linked list
		 * top() -> get element first linked list
		 * pop() -> delete element first linked list
		 * isEmpty() 
		 * size()
		 * 
		 */
		
		Stack st = new Stack();
		
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		
		System.out.println(st.top());
		
		st.print();
		System.out.println();
		System.out.println(st.size());
		
		System.out.println(st.isEmpty());
		
	}
}
