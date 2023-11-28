
public class Example {
	// Using count
	public static void separate0s1sSolution1(int[] arr) {
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0)
				++cnt;
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 0;
		}
		for (int i = cnt; i < arr.length; i++) {
			arr[i] = 1;
		}
	}

	// Using two pointer
	public static void separate0s1sSolution2(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int l = 0, r = arr.length - 1;
			while (arr[l] == 0) {
				++l;
			}
			while (arr[r] == 1) {
				--r;
			}
			if (l < r) {
				int temp = arr[l];
				arr[l] = arr[r];
				arr[r] = temp;
			}
		}
	}

	public static void main(String[] args) {
		/*
		 * Question 20: Given an array of 0’s and 1’s in random order, you need to
		 * separate 0’s and 1’s in an array.
		 */

		int arr[] = { 0, 1, 0, 0, 1, 1, 1, 0, 1 };
		separate0s1sSolution2(arr);
		System.out.println("Array after separating odd and even numbers :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
