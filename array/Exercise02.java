import java.util.Arrays;

public class Exercise02 {
    public static int findMissingNumber(int[] arr) {

		Arrays.sort(arr);
		int smallest = arr[0], largest = arr[arr.length - 1];

        int[] count = new int[largest + 1];

        for(int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        for(int i = smallest; i <= largest; i++) {
            if(count[i] == 0) {
                return i;
            } 
        }
        return -1;
	}

    // Using sum formula

    public static int findMissingNumber2(int[] arr) {
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        int resSum = 0;
        for (int i = 0; i < arr.length; i++) {
            resSum += arr[i];
        }
        return sum - resSum;
    } 

	public static void main(String[] args) {
		/*
		 * Question 11 : Find missing number in the array.
		 */

		int[] arr1 = { 7, 5, 6, 1, 4, 2 };
		System.out.println("Find missing number in the array: " + findMissingNumber(arr1));
		System.out.println("Find missing number in the array: " + findMissingNumber2(arr1));
		
		int[] arr2 = { 5, 3, 1, 2 };
		System.out.println("Find missing number in the array: " + findMissingNumber(arr2));
		System.out.println("Find missing number in the array: " + findMissingNumber2(arr2));
	}
    
}