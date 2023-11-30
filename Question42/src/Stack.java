
public class Stack {
	private Node head;

	public Stack() {
		head = null;
	}
	public Node createNode(int val) {
		Node newNode = new Node();
		newNode.data = val;
		newNode.next = null;
		return newNode;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void push(int val) {
		Node newNode = createNode(val);
		if (isEmpty()) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	public void pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty, cannot delete!");
		} else if (head.next == null) {
			head = null;
		} else {
			head = head.next;
		}
	}

	public int top() {
		if (isEmpty()) {
			System.out.println("Stack is empty, cannot get element top!");
		}
		return head.data;
	}

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public int size() {
		int cnt = 0;
		Node temp = head;
		while (temp != null) {
			++cnt;
			temp = temp.next;
		}
		return cnt;
	}

}
