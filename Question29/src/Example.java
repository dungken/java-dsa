
public class Example {
	// Using for
	public static int count1s(int[] arr) {
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1)
				++cnt;
		}
		return cnt;
	}

	public static int count1sSolution2(int[] arr) {
		int cnt = 0;
		while (arr[cnt] == 0) {
			++cnt;
		}
		return arr.length - cnt;
	}

	// Using divide and conquer approach

	public static int count1sSolution3(int s, int e, int[] arr) {
		if (arr[s] == 1)
			return e - s + 1;
		if (arr[e] == 0)
			return 0;

		int m = (s + e) / 2;
		int leftResult = count1sSolution3(s, m, arr);
		int rightResult = count1sSolution3(m + 1, e, arr);
		return leftResult + rightResult;
	}
	

	public static void main(String[] args) {
		/*
		 * Question 29 : Count 1’s in sorted Binary Array.
		 */
		int[] arr = { 0, 0, 0, 0, 1, 1, 1, 1 };
		System.out.println("Count 1’s in sorted Binary Array is: " + count1s(arr));
		System.out.println("Count 1’s in sorted Binary Array is: " + count1sSolution2(arr));
		System.out.println("Count 1’s in sorted Binary Array is: " + count1sSolution3(0, arr.length - 1, arr));
	}
}
