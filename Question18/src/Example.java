import java.util.Arrays;

public class Example {

	public static void findPairArraySumIsClosest(int[] arr, int x) {
		int n = arr.length;
		int l = 0, r = n - 1;
		int sum = 0;
		int sumMin = Integer.MAX_VALUE;
		int leftIdx = 0, rightIdx = n - 1;

		if(n < 1)
			return;
		
		Arrays.sort(arr);

		while (l < r) {
			sum = arr[l] + arr[r];
			if (Math.abs(x - sum) < Math.abs(sumMin)) {
				sumMin = sum;
				leftIdx = l;
				rightIdx = r;
			}

			if (sum < 0) {
				l++;
			} else {
				r--;
			}
		}
		
		System.out.println("find the pair in array whose sum is closest to " + x + ": " + arr[leftIdx] + " and " + arr[rightIdx]);

	}

	public static void main(String[] args) {
		/*
		 * Question 18 : Given a sorted array and a number x, find the pair in array
		 * whose sum is closest to x array[]={-40,-5,1,3,6,7,8,20}; The pair whose sum
		 * is closest to 5 : 1 and 3
		 */
		
		int[] arr = {-40,-5,1,3,6,7,8,20};
		findPairArraySumIsClosest(arr, 5);
	}
}
