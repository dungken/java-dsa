import java.util.ArrayList;
import java.util.Arrays;

public class Example {

	public static void swap(int[] elements, int a, int b) {
		int temp = elements[a];
		elements[a] = elements[b];
		elements[b] = temp;
	}

	public static void permutations(ArrayList<int[]> res, int[] nums, int l, int h) {
		if (l == h) {
			res.add(Arrays.copyOf(nums, nums.length));
			return;
		}
		
		for (int i = l; i <= h; i++) {
			swap(nums, l, i);
			permutations(res, nums, l + 1, h);
			swap(nums, l, i);
		}
	}

	public static ArrayList<int[]> permute(int[] nums) {
		ArrayList<int[]> res = new ArrayList<int[]>();
		int x = nums.length - 1;

		permutations(res, nums, 0, x);
		return res;
	}

	public static void main(String[] args) {
		/*
		 * Question 32 : Permutations of array in java.
		 */
		int[] arr = { 1, 2, 3 };
//		int[] arr = { 1, 2, 3, 4, 5, 6 };
		ArrayList<int[]> res = permute(arr);
		for (int[] x : res) {
			for (int y : x) {
				System.out.print(y + " ");
			}
			System.out.println();
		}
	}
}
