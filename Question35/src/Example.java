
public class Example {
	
	public static int findMaximumDifference(int[] arr) {
		
		int minElementTillNow = arr[0];
		int maxDiffence = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			int difference = 0;
			if (arr[i] > minElementTillNow) {
				difference = arr[i] - minElementTillNow;
				if (difference > maxDiffence) {
					maxDiffence = difference;
				}
			} else {
				minElementTillNow = arr[i];
			}
		}
		return maxDiffence;
	}

	public static void main(String[] args) {
		/*
		 * Question 35 : Find maximum difference between two elements such that larger
		 * element appears after the smaller number.
		 */
		int[] arr = {14, 12, 70, 15, 95, 65, 22, 30};
		System.out.println("Maximum difference between two elements is: " + findMaximumDifference(arr));
	}
}
