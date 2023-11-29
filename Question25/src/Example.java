import java.util.HashMap;
import java.util.HashSet;

public class Example {
	// Using loop
	public static void countNumberOccurrences(int[] arr) {
		System.out.println("Output: ");
		for (int i = 0; i < arr.length; i++) {
			int cnt = 0;
			int currentVal = arr[i];
			int idxCurr = i;

			while ((idxCurr < arr.length) && (arr[idxCurr] == currentVal)) {
				cnt++;
				idxCurr++;
			}

			System.out.println("Frequency of " + currentVal + " is : " + cnt);
			i += cnt - 1;
		}
	}

	// Using Map

	public static void countNumberOccurrences2(int[] arr) {
		System.out.println("Output: ");
		HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (mp.get(arr[i]) != null) {
				mp.put(arr[i], mp.get(arr[i]) + 1);
			} else {
				mp.put(arr[i], 1);
			}
		}

		for (Integer key : mp.keySet()) {
			System.out.println("Frequency of " + key + " is : " + mp.get(key));
		}
	}

	// Using two pointer

	public static int countNumberOccurrences3(int s, int e, int[] arr, int element) {
		if (s > e)
			return 0;
		// Case 1 element
		if (s == e) {
			if (arr[s] == element && arr[e] == element) {
				return 1;
			} else {
				return 0;
			}
		}
		// Case > 1 element
		if (arr[s] == element && arr[e] == element)
			return (e - s + 1);

		int m = (s + e) / 2;

		int leftResult = countNumberOccurrences3(s, m, arr, element);
		int rightResult = countNumberOccurrences3(m + 1, e, arr, element);
		return leftResult + rightResult;

	}

	public static void main(String[] args) {
		/*
		 * Question 25 : Count number of occurrences (or frequency) of each element in a
		 * sorted array
		 */
		int[] arr = { 1, 1, 1, 3, 3, 4, 5, 5, 6, 6 };

		countNumberOccurrences(arr);
		countNumberOccurrences2(arr);
		
		System.out.println("Output: ");
		HashSet<Integer> se = new HashSet<Integer>();
		for (int item : arr) {
			if (!se.contains(item)) {
				System.out.println(
						"Frequency of " + item + " is : " + countNumberOccurrences3(0, arr.length - 1, arr, item));
				se.add(item);
			}
		}
		
	}
}
