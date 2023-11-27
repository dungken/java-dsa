
public class Exercise03 {

    public static int searchElement(int[] arr, int low, int high, int element) {
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arr[mid] == element) {
                return mid;
            }
            if (arr[mid] <= arr[high]) {
                //
                if (element > arr[mid] && element <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            } else {
                if (arr[low] <= element && element < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        /*
         * Question 12 : Search an element in rotated and sorted array.
         */

        int arr[] = { 16, 19, 21, 25, 3, 5, 8, 10 };
        System.out.println("Index of element 5 is: " + searchElement(arr, 0, arr.length - 1, 5));
        System.out.println("Index of element 11 is: " + searchElement(arr, 0, arr.length - 1, 11));
    }
}