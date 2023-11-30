
public class QueueUsingArray {
	/*
	 * Queue (FIFO) isEmpty() -> check queue empty size() -> size queue push() ->
	 * push element last array peek() -> get element head array pop() -> delete
	 * element head array
	 * 
	 */

	private int[] arr;
	private int size;

	public QueueUsingArray(int nums) {
		this.arr = new int[nums];
		size = 0;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}

	public void push(int val) {
		this.arr[size++] = val;
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Queue empty!");
		}
		return this.arr[0];
	}

	public int pop() {
		if (!isEmpty()) {
			for (int i = 1; i < size; i++) {
				arr[i - 1] = arr[i];
			}
			size--;
			return arr[0];
		}

		return -1;
	}

	public void print() {
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
