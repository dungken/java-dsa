package implement;

public class QueueUsingLinkedList {
	private Node head;

	// push -> them cuoi
	// peek -> lay dau
	// pop -> xoa dau

	public QueueUsingLinkedList() {
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

	public void print() {
		if (isEmpty()) {
			System.out.println("Queue empty");
			return;
		}
		Node nodeTemp = head;
		while (nodeTemp != null) {
			System.out.print(nodeTemp.data + " ");
			nodeTemp = nodeTemp.next;
		}
	}

	public int size() {
		int cnt = 0;
		Node nodeTemp = head;
		while (nodeTemp != null) {
			++cnt;
			nodeTemp = nodeTemp.next;
		}
		return cnt;
	}

	public void push(int val) {
		Node newNode = createNode(val);
		if (isEmpty()) {
			head = newNode;
		} else {
			Node nodeTemp = head;
			while (nodeTemp.next != null) {
				nodeTemp = nodeTemp.next;
			}
			nodeTemp.next = newNode;
		}
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Queue empty, cannot get element!");
		}
		return head.data;
	}

	public void pop() {
		if (isEmpty()) {
			System.out.println("Queue empty, cannot delete element!");
		}
		head = head.next;
	}

}
