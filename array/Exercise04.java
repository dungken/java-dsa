import java.util.Arrays;
import java.util.Scanner;

public class Exercise04 {

    // Using sort array
    public static int findSecondLargestNumber(int[] arr) {
        if (arr == null || arr.length < 2)
            return -1;
        // sort arr
        Arrays.sort(arr);
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != arr[arr.length - 1])
                return arr[i];
        }
        return -1;
    }

    // Using another
    public static int findSecondLargestNumber2(int[] arr) {
        if(arr == null || arr.length < 2) 
            return -1;
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > highest) {
                secondHighest = highest;
                highest = arr[i];
            } else if(arr[i] > secondHighest && arr[i] != highest) {
                secondHighest = arr[i];
            }
        }

        if(highest == secondHighest) 
            return -1;
            
        return secondHighest;

    }



    public static void main(String[] args) {
        /*
         * Question 14: Find second largest number in an array
         * You are given an sorted and rotated array as below:
         * For example:
         * int[] arr1={7,5,6,1,4,2};
         * Second largest element in the array : 6
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number your array is: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element array is: ");
            int x = sc.nextInt();
            arr[i] = x;
        }

        System.out.println("Largest Second element in array is: " + findSecondLargestNumber(arr));
        System.out.println("Largest Second element in array is: " + findSecondLargestNumber2(arr));
    }
}