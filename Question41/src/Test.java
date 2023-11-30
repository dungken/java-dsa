
public class Test {
	
	public static Stack sortStack(Stack st) {
		Stack stTemp = new Stack(10);

		while (!st.isEmpty()) {
			int currentData = st.top();
			st.pop();

			while (!stTemp.isEmpty() && (stTemp.top() > currentData)) {
				st.push(stTemp.top());
				stTemp.pop();
			}

			stTemp.push(currentData);
		}
		return stTemp;
	}
	
	
	public static void main(String[] args) {
		/*
		 * Question 41: Implement a stack using array. 
		 * push() -> push element head array
		 * peek() -> get element head array 
		 * pop() -> delete element head array
		 * isEmpty() -> check stack empty
		 * size() -> get size stack
		 */
		
		Stack st = new Stack(10);
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(0);
		st.push(10);
		st.push(-1);
		st.push(5);
		
		st.print();
		
		Stack stSorted = sortStack(st);
		System.out.println();
		stSorted.print();
	}
}
