import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class Example {
	// Using Linked Hash Map

	public static int findFirstRepeatElement(int[] arr) {
		Map<Integer, Integer> mp = new LinkedHashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (mp.containsKey(arr[i])) {
				mp.put(arr[i], mp.get(arr[i]) + 1);
			} else {
				mp.put(arr[i], 1);
			}
		}

		for (int element : mp.keySet()) {
			if (mp.get(element) > 1) {
				return element;
			}
		}

		return -1;
	}

	// Using HashSet
	public static int findFirstRepeatElement2(int[] arr) {
		int idx = -1;
		HashSet<Integer> se = new HashSet<Integer>();

		for (int i = arr.length - 1; i >= 0; i--) {
			if (se.contains(arr[i])) {
				idx = i;
			} else {
				se.add(arr[i]);
			}
		}
		return arr[idx];
	}

	public static void main(String[] args) {
		/*
		 * Question 30 : Find first repeating element in an array of integers.
		 */

//		int[] arr = { 10, 7, 8, 1, 8, 7, 6 };
		int[] arr = { 10, 7, 8, 1, 8, 7, 10 };

		int firstRepeatElement = findFirstRepeatElement2(arr);
		System.out.println(firstRepeatElement + "[" + firstRepeatElement + " is the first element actually repeats]");
	}
}
