
public class Example {
	public static void searchElementInSortedMatrix(int[][] sortedMatrix, int X) {
		int R = sortedMatrix.length;
		int C = sortedMatrix[0].length;

		int r = 0, c = C - 1;

		while (r <= R - 1 && c >= 0) {
			if (sortedMatrix[r][c] == X) {
				System.out.println("Element found at r = " + r + " c = " + c);
				return;
			}

			if (X < sortedMatrix[r][c]) {
				c = c - 1;
			} else {
				r = r + 1;
			}
		}
		
		System.out.println("Element is not found in sorted matrix");
	}

	public static void main(String[] args) {
		/*
		 * Question 36 : Search in a row wise and column wise sorted matrix.
		 */

		int[][] sortedMatrix = { 
				{ 1, 6, 10, 12, 20 }, 
				{ 4, 8, 15, 22, 25 }, 
				{ 5, 20, 35, 37, 40 },
				{ 10, 28, 38, 45, 55 } 
		};
		searchElementInSortedMatrix(sortedMatrix, 37);
	}
}
