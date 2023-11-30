
public class Example {

	public static int calculateMaxProfit(int[] arr) {
		int lowestPriceTillThatDay = arr[0];
		int maxProfix = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			int profit = 0;
			if (arr[i] > lowestPriceTillThatDay) {
				profit = arr[i] - lowestPriceTillThatDay;
				if (profit > maxProfix)
					maxProfix = profit;
			} else {
				lowestPriceTillThatDay = arr[i];
			}
		}
		return maxProfix;
	}

	public static void main(String[] args) {
		/*
		 * Question 34 : Stock Buy Sell to Maximize Profit.
		 */

		int[] arr = { 14, 12, 70, 15, 99, 65, 21, 90 };
		System.out.println("Maximum profit: " + calculateMaxProfit(arr));
	}
}
