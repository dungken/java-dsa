import java.util.Arrays;

public class Example {
	static int findPlatformsRequiredForStation(int arr[], int dep[], int n) {
		int platform_needed = 0, maxPlatforms = 0;
		Arrays.sort(arr);
		Arrays.sort(dep);
		int i = 0, j = 0;

		// Similar to merge in merge sort
		while (i < n && j < n) {
			if (arr[i] < dep[j]) {
				platform_needed++;
				i++;
				if (platform_needed > maxPlatforms)
					maxPlatforms = platform_needed;
			} else {
				platform_needed--;
				j++;
			}
		}
		return maxPlatforms;
	}

	public static void main(String[] args) {
		/*
		 * Question 16 : Find minimum number of platforms required for railway station
		 */
		// arr[] = {1:00, 1:40, 1:50, 2:00, 2:15, 4:00}
		// dep[] = {1:10, 3:00, 2:20, 2:30, 3:15, 6:00}

		int arr[] = { 100, 140, 150, 200, 215, 400 };
		int dep[] = { 110, 300, 220, 230, 315, 600 };
		System.out.println("Minimum platforms needed:" + findPlatformsRequiredForStation(arr, dep, 6));
	}
}
