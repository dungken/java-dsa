
public class Stack {
	private int[] arr;
	private int size = 0;
	private int nums = 0;

	public Stack(int nums) {
		this.arr = new int[nums];
		this.nums = nums;
	}
	
	// 1 2 3 4
	
	public void push(int val) {
		this.arr[size] = val;
		size++;
	}
	
	public int top() {
		return this.arr[size - 1]; 
	}
	
	public void pop() {
		--size;
	}

	public boolean isEmpty() {
		return size == 0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isFull() {
		return size == nums;
	}
	
	public void print() {
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
