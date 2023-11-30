
public class Example {
	public static int[] rotateOptimized(int[] nums, int k) {
		int n = nums.length;

		if (k > n)
			k = k % n;

		nums = reverse(nums, 0, n - 1);
		nums = reverse(nums, 0, k - 1);
		nums = reverse(nums, k, n - 1);
		return nums;
	}

	public static int[] reverse(int[] nums, int s, int e) {
		while (s <= e) {
			int temp = nums[s];
			nums[s] = nums[e];
			nums[e] = temp;
			s++;
			e--;
		}
		return nums;
	}

	public static void main(String[] args) {
		/*
		 * Question 33 : Rotate an array by K positions. 1 2 3 4 5 6 : k = 2 => 5 6 1 2
		 * 3 4
		 */

		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int[] result = rotateOptimized(arr, 2);
		System.out.print("{ ");
		int cnt = 0;
		for (int i : result) {
			++cnt;
			System.out.print(i);
			if (cnt != result.length)
				System.out.print(", ");
		}
		System.out.print(" }");
	}
}
