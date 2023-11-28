
public class Example {
	
	public static void sort(int[] arr) {
		
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0)
				++count0;
			else if (arr[i] == 1)
				++count1;
			else
				++count2;
		}
		for (int i = 0; i < count0; i++) {
			System.out.print(0 + " ");
		}
		for (int i = 0; i < count1; i++) {
			System.out.print(1 + " ");
		}
		for (int i = 0; i < count2; i++) {
			System.out.print(2 + " ");
		}
	}

	public static void sort2(int[] a) {
		/* array to keep the count of 0s, 1s, 2s */
		int[] freq = new int[3];

		/*
		 * traverse the given array for filling the frequency array
		 */
		
		for (int val : a) {
			freq[val]++;
		}
		
		/* pointer to traverse the given array again */
		int pointer = 0;
		for (int i = 0; i < freq.length; i++) {
			/* loop to exhaust the number of 0s, 1s, 2s */
			while (freq[i]-- > 0) {
				/* at the current pointer plot the current number */
				a[pointer] = i;
				/* increment the pointer */
				pointer++;
			}
		}
	}

	public static void main(String[] args) {
		/*
		 * Question 22 : Given an array containing zeroes, ones and twos only. Write a
		 * function to sort the given array in O(n) time complexity. Input : [1, 2, 2,
		 * 0, 0, 1, 2, 2, 1] Output : [0, 0, 1, 1, 1, 2, 2, 2, 2]
		 */

		int[] arr = { 1, 2, 2, 0, 0, 1, 2, 2, 1 };
		sort2(arr);
		for (int val : arr) {
			System.out.print(val + " ");
		}
	}
}
