import java.util.Arrays;

public class Example {
	
	public static void findPairSumIsClosestToZero2(int[] arr) {
		int n = arr.length;
		int sum = 0;
		int minSum = Integer.MAX_VALUE;
		int l = 0, r = n - 1;
		int findLeft = l, findRight = n - 1;

		if (n < 1)
			return;

		Arrays.sort(arr);
		while (l < r) {
			sum = arr[l] + arr[r];
			if (Math.abs(sum) < Math.abs(minSum)) {
				minSum = sum;
				findLeft = l;
				findRight = r;
			}

			if (sum < 0) {
				l++;
			} else {
				r--;
			}
		}
		System.out.println("The pair whose sum is closest to zero : " + arr[findLeft] + " and " + arr[findRight]);
	}

	public static void findPairSumIsClosestToZero(int[] arr) {

		if (arr.length < 2)
			return;

		int min_val = arr[0] + arr[1];
		int findResult1 = 0, findResult2 = 1;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int tem = arr[i] + arr[j];

				if (Math.abs(tem) < Math.abs(min_val)) {
					min_val = tem + arr[j];
					findResult1 = arr[i];
					findResult2 = arr[j];
				}

			}

		}
		System.out.println("The pair whose sum is closest to zero : " + findResult1 + " and " + findResult2);
	}

	public static void main(String[] args) {
		/*
		 * Question 17 : Find a Pair Whose Sum is Closest to zero in Array
		 * array[]={1,3,-5,7,8,20,-40,6}; The pair whose sum is closest to zero : -5 and
		 * 6 1,3,-5,7,8,20,-40,6 => -40 -5 1 3 6 7 8 20
		 */

		int[] arr = { 1, 3, -5, 7, 8, 20, -40, 6 };
		findPairSumIsClosestToZero(arr);
		findPairSumIsClosestToZero2(arr);
	}
}
