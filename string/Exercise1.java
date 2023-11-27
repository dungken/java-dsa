import java.util.Scanner;
import java.util.Stack;

public class Exercise1 {
    public static void main(String[] args) {
        /*
         * Question 1 : How to reverse a String in java? Can you write a program without using any java inbuilt methods?
         * VD: hello => olleh
         * C1: Using for
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = sc.nextLine();

        /*
        // C1: Using for
        String reverse = "";
        for(int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println("Reverse string is: " + reverse);
         */

        /*
        // C2: Using stack
        Stack<Character> reverse = new Stack<Character>();
        for(int i = 0; i < str.length(); i++) {
            reverse.push(str.charAt(i));
        }
        while(reverse.size() > 0) {
            System.out.print(reverse.peek());
            reverse.pop();
        }
        */

        /*
         // C3: Using recursion
        System.out.println("String is reversed: " + reverseStringRecursion(str));
         */

        // C4: Using StringBuffer's reverse() method
        StringBuffer sb = new StringBuffer(str);
        System.out.println("String is reversed: " + sb.reverse());

    }

    public static String reverseStringRecursion(String orgString) {
        if(orgString.length() == 1) 
            return orgString;
        return orgString.charAt(orgString.length() - 1) + reverseStringRecursion(orgString.substring(0, orgString.length() - 1));
    }
}