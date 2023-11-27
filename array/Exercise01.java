
public class Exercise01 {

	public static void findSmallestAndLargestElement(int[] arr) {
		int min = arr[0], max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Smallest element in array is: " + min);
		System.out.println("Largest element in array is: " + max);

	}

	public static void main(String[] args) {
		/*
		 * Question 10 : Write java Program to Find Smallest and Largest Element in an
		 * Array.
		 */
		
		int[] arr = new int[] { 1, 5, 6, 0, 10, 20, 100, 400, 302 };
		findSmallestAndLargestElement(arr);
	}
}
