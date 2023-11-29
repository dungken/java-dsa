import java.util.Arrays;

public class Example {
	// 
	public static boolean checkArrayElementsAreConsecutive(int[] arr) {
		Arrays.sort(arr);
		
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] - arr[i - 1] != 1)
				return false;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		/*
		 * Question 31 : Check if Array Elements are Consecutive.
		 */
		
//		int[] arr = {5, 3, 4, 1, 2};
//		int[] arr = {47, 43, 45, 44, 46};
		int[] arr = {6, 7, 5, 6};
		System.out.println("Check if Array Elements are Consecutive: " + checkArrayElementsAreConsecutive(arr));
	}
}
