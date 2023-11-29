
public class Example {
	// Using brute force
	public static int findLocalMinima(int[] arr) {
		int res = -1;
		boolean check = false;
		for (int i = 1; i <= arr.length - 2; i++) {
			if (arr[i] < arr[i - 1] && arr[i] < arr[i + 1]) {
				res = i;
				check = true;
			}
		}
		if (!check) {
			if (arr[0] < arr[1]) {
				return 0;
			} else {
				return arr.length - 1;
			}
		}
		return res;
	}

	// Using base binary search

	public static int localMinUtil(int[] arr, int l, int r, int n) {
		int m = l + (r - l) / 2;
		if ((m == 0 || arr[m - 1] > arr[m]) && (m == n - 1 || arr[m] < arr[m + 1])) {
			return m;
		} else if (m > 0 && arr[m - 1] < arr[m])
			return localMinUtil(arr, l, m - 1, n);
		else
			return localMinUtil(arr, m + 1, r, n);
	}
	
	public static int findLocalMinima(int[] arr, int n) {
		return localMinUtil(arr, 0, n - 1, n);
	}

	public static void main(String[] args) {
		/*
		 * Question 23 : Find local minima in array
		 */
//		int arr[] = {9, 6, 3, 14, 5, 7, 4};
//		int arr[] = {23, 8, 15, 2, 3};
//		int arr[] = {1, 2, 3};
		int arr[] = { 3, 2, 1 };
		System.out.println("Find local minima in array: " + findLocalMinima(arr));
		System.out.println("Find local minima in array: " + findLocalMinima(arr, arr.length));
	}
}
