
import java.util.HashMap;

public class Example {
	// Using brute force
	public static void solve(int[] arr, int sum) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == sum) {
					System.out.println("starting index : " + i + ", Ending index : " + j);
				} else if (arr[i] == sum) {
					System.out.println("starting index : " + i + ", Ending index : " + i);
				}
			}
		}
	}

	// Using HashMap
	public static void solve2(int[] arr, int sum) {
		HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			mp.put(arr[i], i);
		}

		for (int item : mp.keySet()) {
			if (mp.containsKey(sum - item) && (mp.get(item) < mp.get(sum - item))) {
				System.out.println("starting index : " + mp.get(item) + ", Ending index : " + mp.get(sum - item));
			}
			if (item == sum) {
				System.out.println("starting index : " + mp.get(item) + ", Ending index : " + mp.get(item));
			}
		}
	}

	public static void main(String[] args) {
		/*
		 * Question 26 : Find subarrays with given sum in an array.
		 */
		int[] arr = { 2, 3, 6, 4, 9, 0, 11 };
		solve(arr, 9);
		System.out.println();
		solve2(arr, 9);
	}
}
