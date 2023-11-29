import java.util.HashSet;

public class Example {
	// Using brute force
	public static void findLeader(int[] arr) {
		HashSet<Integer> se = new HashSet<Integer>();
		for (int i = 0; i < arr.length - 1; i++) {
			boolean check = true;
			int valCurr = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > valCurr) {
					check = false;
					break;
				}
			}

			if (check) {
				se.add(valCurr);
			}
		}

		se.add(arr[arr.length - 1]);
		
		System.out.print("Here ");
		int cnt = 0;
		for (int val : se) {
			++cnt;
			System.out.print(val);
			if (cnt != se.size())
				System.out.print(", ");
		}
		System.out.print(" are leader elements");
	}
	
	// Using 1 loop for
	
	public static void findLeader2(int[] arr) {
		int maxCurr = arr[arr.length - 1];
		System.out.print("\nHere " + maxCurr + " ");
		for (int i = arr.length - 2; i >= 0; i--) {
			if(arr[i] > maxCurr) {
				maxCurr = arr[i];
				System.out.print(arr[i] + " ");
			}
		}
		System.out.print(" are leader elements");
	}
	
	

	public static void main(String[] args) {
		/*
		 * Question 28 : Find leaders in an array.
		 */
		int[] arr = {14, 12, 70, 15, 99, 65, 21, 90};
		findLeader(arr);
		findLeader2(arr);
	}
}
