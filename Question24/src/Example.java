import java.util.LinkedList;

public class Example {
	// Using brute force

	public static void slidingWindowMaximum(int[] arr, int k) {
		for (int i = 0; i <= arr.length - k; i++) {
			int resMax = Integer.MIN_VALUE;
			for (int j = i; j < i + k; j++) {
				if (arr[j] > resMax) {
					resMax = arr[j];
				}
			}
			System.out.print(resMax);
			if (i != arr.length - k)
				System.out.print(", ");
		}
	}

	// Using deque
	public static void slidingWindowMaximumDeque(int[] arr, int k) {
		LinkedList<Integer> deque = new LinkedList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			/*
			 * keep removing the elements from deque which are smaller than the current
			 * element, because we need to keep our deque sorted in dec order
			 */
			while (!deque.isEmpty() && arr[deque.getLast()] <= arr[i]) {
				deque.removeLast();
			}

			/*
			 * removing the i-k element, because that element does not belong to the
			 * subarray we are currently working on.
			 */
			while(!deque.isEmpty() && deque.getFirst() <= i - k) {
				deque.removeFirst();
			}
			deque.addLast(i);
			
			if(i >= k - 1) {
				/* only print when we have processed atleast k elements 
	             * to make the very first subarray
	             */
				System.out.print(" " + arr[deque.getFirst()]);
			}
		}
	}

	public static void main(String[] args) {
		/*
		 * Question 24 : Sliding window maximum in java
		 */
		int[] arr = { 2, 6, -1, 2, 4, 1, -6, 5 };
		slidingWindowMaximum(arr, 3);
		System.out.println();
		slidingWindowMaximumDeque(arr, 3);
	}
}
