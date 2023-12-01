package LinkedList;

public class LinkedListExample {
	private Node head;

	public LinkedListExample() {
		this.head = null;
	}

	// Kiem tra linked list rong
	public boolean isEmpty() {
		return head == null;
	}

	// Lay kich thuc cua linked list
	public int size() {
		int cnt = 0;
		Node node = head;
		while (node != null) {
			++cnt;
			node = node.next;
		}
		return cnt;
	}

	// Duyet linked list
	public void print() {
		Node node = head;
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	// Tao node
	public Node createNode(int val) {
		Node newNode = new Node();
		newNode.data = val;
		;
		newNode.next = null;
		return newNode;
	}

	// Them phan tu vao dau danh sach
	public void addFirst(int val) {
		Node newNode = createNode(val);
		if (isEmpty()) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	// Them phan tu vao cuoi danh sach

	public void addLast(int val) {
		Node newNode = createNode(val);
		if (isEmpty()) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	// Them phan tu vao vi tri bat ky trong danh sach
	public void addMiddle(int val, int k) {
		if (isEmpty()) {
			head = createNode(val);
		} else {
			if (k == 0) {
				// k = 0 -> addFirst
				addFirst(val);
			} else if (k == size() - 1) {
				// k = size() - 1 -> addLast
				addLast(val);
			} else if (k > 0 && k < size()) {
				// 1 2 5 3
				// 0 1 2 4
				Node newNode = createNode(val);
				Node temp = head;

				for (int i = 1; i < k; i++) {
					temp = temp.next;
				}

				Node currNode = temp.next;
				newNode.next = currNode;
				temp.next = newNode;

			} else {
				System.out.println("Index invalid!");
			}
		}
	}
	// Xoa phan tu dau danh sach

	public void removeFirst() {
		if (isEmpty()) {
			System.out.println("Linked list empty");
		} else {
			int dataFirst = head.data;
			head = head.next;
			System.out.println(dataFirst);
		}
	}

	// Xoa phan tu cuoi danh sach

	public void removeLast() {
		if (isEmpty()) {
			System.out.println("Linked list empty");
		} else if (head.next == null) {
			int data = head.data;
			head = null;
			System.out.println(data);
		} else {
			Node temp = head;
			while (temp.next.next != null) {
				temp = temp.next;
			}
			int data = temp.next.data;
			temp.next = null;
			System.out.println(data);
		}
	}
	// Xoa phan tu o vi tri bat ky trong danh sach

	public void removeMiddle(int k) {
		if (isEmpty()) {
			System.out.println("Linked list empty");
		} else if (k == 0) {
			removeFirst();
		} else if (k == size() - 1) {
			removeLast();
		} else if (k > 0 && k < size()) {
			// 1 2 5 3
			// 0 1 2 4

			Node temp = head;

			for (int i = 0; i < k - 1; i++) {
				temp = temp.next;
			}

			Node delNode = temp.next;

			temp.next = delNode.next;

			System.out.println(delNode.data);

		} else {
			System.out.println("Index invalid!");
		}
	}

	// Reverse linkedlist using this function
	public Node reverseLinkedList(Node currentNode) {
		// For first node, previousNode will be null
		Node previousNode = null;
		Node nextNode;
		while (currentNode != null) {
			nextNode = currentNode.next;
			// reversing the link
			currentNode.next = previousNode;
			// moving currentNode and previousNode by 1 node
			previousNode = currentNode;
			currentNode = nextNode;
		}
		return previousNode;
	}

	// Find middle element

	public int findMiddleElement1() {
		if (isEmpty())
			System.out.println("Linked list is empty");
		Node temp = head;
		
		for (int i = 0; i < size() / 2; i++) {
			temp = temp.next;
		}

		return temp.data;
	}

	public int findMiddleElement2() {
		if (isEmpty())
			System.out.println("Linked list is empty");
		Node slowPointer, fastPointer;

		slowPointer = fastPointer = head;

		while (fastPointer != null) {
			fastPointer = fastPointer.next;
			if (fastPointer != null && fastPointer.next != null) {
				slowPointer = slowPointer.next;
				fastPointer = fastPointer.next;
			}
		}
		return slowPointer.data;
	}

}
