
public class Example {
	public static int dynamicProgramForMaxSubArray(int[] arr) {
		
		int[] result = new int[arr.length];
		result[0] = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			result[i] = Math.max(result[i - 1] + arr[i], arr[i]);
//			System.out.println(result[i]);
		}
		
		int maxSumArray = result[0];
		for (int j = 1; j < result.length; j++) {
			if (maxSumArray < result[j])
				maxSumArray = result[j];
		}

		return maxSumArray;
	}

	public static void main(String[] args) {
		/*
		 * Question 37 : Largest sum contiguous subarray.
		 */
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(dynamicProgramForMaxSubArray(arr));

	}
}
