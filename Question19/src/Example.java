import java.util.HashMap;
import java.util.Map;

public class Example {
	// Using brute force
	public static void findAllPairsOfElement(int[] arr, int x) {
		int n = arr.length;
		if (n < 1)
			return;

		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
		int i = 0, j;
		System.out.print("Pair of elements whose sum is equal to " + x + " :");
		for (i = 0; i < n - 1; i++) {
			for (j = i + 1; j < n; j++) {
				if (arr[i] + arr[j] == x) {
					mp.put(arr[i], arr[j]);
				}
			}
		}

		int cnt = 0;
		for (Integer item : mp.keySet()) {
			++cnt;
			if (cnt != mp.size() - 1)
				System.out.print(" and ");
			System.out.print(item + ", " + mp.get(item));
		}
	}

	// Using
	public static void findAllPairsOfElement2(int[] arr, int x) {
		int n = arr.length;
		if (n < 2)
			return;

		System.out.print("Pair of elements whose sum is equal to " + x + " :");
		int l = 0, r = n - 1;
		while (l < r) {
			int sum = arr[l] + arr[r];
			if (sum == x) {
				System.out.print(arr[l] + ", " + arr[r] + " ; ");
				l++;
				r--;
			} else if (sum > x) {
				--r;
			} else {
				++l;
			}
		}
	}

	// Using HashMap
	public static void findAllPairsOfElement3(int[] arr, int x) {
		int n = arr.length;
		if (n < 2)
			return;

		System.out.print("Pair of elements whose sum is equal to " + x + " :");
		HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			mp.put(arr[i], i);
		}

		for (int i = 0; i < arr.length; i++) {
			if ((mp.get(Math.abs(x - arr[i])) != null) && (mp.get(Math.abs(x - arr[i])) != i)) {
				System.out.println(arr[i] + ", " + (x - arr[i]));
			}
		}
	}

	public static void main(String[] args) {
		/*
		 * Question 19 : Find all pairs of elements from an array whose sum is equal to
		 * given number array[]={ -40, -5, 1, 3, 6, 7, 8, 20 }; Pair of elements whose
		 * sum is equal to 15 : 7, 8 and -5, 20
		 */

		int[] arr = { -40, -5, 1, 3, 6, 7, 8, 20 };
		findAllPairsOfElement(arr, 15);
		System.out.println();
		findAllPairsOfElement2(arr, 15);
		System.out.println();
		findAllPairsOfElement3(arr, 15);
	}
}
