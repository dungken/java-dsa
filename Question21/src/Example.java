
public class Example {
	
	public static void separateOddAndEven(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int l = 0, r = arr.length - 1;
			while (arr[l] % 2 == 0) {
				++l;
			}
			while (arr[r] % 2 == 1) {
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
		 * Question 21 : Separate odd and even numbers in an array
		 */
		
		int arr[] = {12, 17, 70, 15, 22, 65, 21, 90};
		separateOddAndEven(arr);
		System.out.println("Array after separating odd and even numbers :");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}
}
