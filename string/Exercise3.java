import java.util.HashSet;
import java.util.Scanner;

public class Exercise3 {
	public static boolean isAllUniqueCharactersUsingHashSet(String str) {
		HashSet<Character> alphaUnique = new HashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (!alphaUnique.add(c))
				return false;
		}
		return true;
	}

	public static boolean isAllUniqueCharactersUsingMethod(String str) {

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (str.indexOf(c) != str.lastIndexOf(c))
				return false;
		}
		return true;
	}

	public static boolean isAllUniqueCharactersUsingAscii(String str) {

		int[] count = new int[26];
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.toLowerCase().charAt(i);
			count[c - 97]++;
		}
		
		for (int i = 0; i < 26; i++) {
			if(count[i] > 1) 
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		/*
		 * Question 3 : Write a program to check if String has all unique characters in
		 * java? 
		 * Using HashSet 
		 * Using indexOf & lastIndexOf 
		 * Using ascii value of character
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter test string: ");
		String strTest = sc.nextLine();
		System.out.println("String has all unique characters: " + isAllUniqueCharactersUsingHashSet(strTest));
		System.out.println("String has all unique characters: " + isAllUniqueCharactersUsingMethod(strTest));
		System.out.println("String has all unique characters: " + isAllUniqueCharactersUsingAscii(strTest));
	}
}
