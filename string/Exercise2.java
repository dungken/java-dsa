
import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
	public static boolean isAnagramUsingStringMethods(String str, String anagram) {
		if(str.length() != anagram.length())
			return false;
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			int index = anagram.indexOf(c);
			
			if(index != -1) {
				anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
			} else {
				return false;
			}
		}
		return anagram.isEmpty();
	}
	
	public static String sortChars(String word) {
		// Chuyen chuoi => Mang char
		char[] arrChars = word.toLowerCase().toCharArray();
		// Tra ve chuoi da sx
		Arrays.sort(arrChars);
		return String.valueOf(arrChars);
	}
	
	public static boolean isAnagramUsingArraySort(String word, String anagram) {
		String wordSort = sortChars(word);
		String anagramSort = sortChars(anagram);
		return wordSort.equals(anagramSort);
	}
	
	public static boolean isAnagramUsingCountingArray(String word, String anagram) {
		if(word.length() != anagram.length())
			return false;
		int[] count = new int[256];
		for (int i = 0; i < word.length(); i++) {
			count[word.charAt(i)]++;
			count[anagram.charAt(i)]--;
		}
		for (int i = 0; i < count.length; i++) {
			if(count[i] != 0)
				return false;
		}
		return true;
	}
	
	
	
	public static void main(String[] args) {
		/*
		 * Question 2 : Write a java program to check if two Strings 
		 * are anagram in java?
		 */
		
		// Using string method
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string 1: ");
		String str1 = sc.nextLine();
		System.out.println("Enter string 2: ");
		String str2 = sc.nextLine();
		
		System.out.println("1. Two Strings are anagram: " + isAnagramUsingStringMethods(str1, str2));
		
		// Using Arrays.sort()
		
		System.out.println("2. Two Strings are anagram: " + isAnagramUsingArraySort(str1, str2));
		
		// Using counting array
		
		System.out.println("3. Two Strings are anagram: " + isAnagramUsingCountingArray(str1, str2));
	}
}
