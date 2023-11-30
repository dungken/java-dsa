import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueues {
	Queue<Integer> queue1;
	Queue<Integer> queue2;

	public StackUsingTwoQueues() {
		queue1 = new LinkedList<Integer>();
		queue2 = new LinkedList<Integer>();
	}

	public void push(int i) {
		if (queue1.size() == 0) {
			queue1.add(i);
		} else {
			int sizeOfQueue1 = queue1.size();

			for (int j = 0; j < sizeOfQueue1; j++) {
				queue2.add(queue1.remove());
			}
			queue1.add(i);

			for (int k = 0; k < sizeOfQueue1; k++) {
				queue1.add(queue2.remove());
			}
		}

	}

	public int pop() {
		if (queue1.size() == 0) {
			System.out.println("Stack empty, cannot pop!");
		}
		return queue1.remove();
	}

	public static void main(String[] args) {
		StackUsingTwoQueues st = new StackUsingTwoQueues();

		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);

		System.out.println("Removed element: " + st.pop());
		System.out.println("Removed element: " + st.pop());
	}
}
