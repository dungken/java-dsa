
public class Example {

	public static int findPeek(int[] arr) {
		int n = arr.length;
		if (n == 1)
			return 0;
		if (arr[0] > arr[1])
			return 0;
		if (arr[n - 1] > arr[n - 2])
			return n - 1;
		for (int i = 1; i < n - 1; i++) {
			if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1])
				return i;
		}
		return -1;

	}

	public static void main(String[] args) {
		/*
		 * Question 27 : Find peak element in the array.
		 */
//		int[] arr = {5, 10, 20, 15};
//		int[] arr = {5, 10, 15};
		int[] arr = {2, 1, 0};
		System.out.println("Peak element in the array is: " + arr[findPeek(arr)]);
		
	}
}
