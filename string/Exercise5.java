import java.util.HashMap;
import java.util.Scanner;

public class Exercise5 {
	
	public static void findDuplicateCharacters(String str) {
		HashMap<Character, Integer> countDupChar = new HashMap<Character, Integer>();
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			if(countDupChar.containsKey(c)) {
				countDupChar.put(c, countDupChar.get(c) + 1);
			} else {
				countDupChar.put(c, 1);
			}
		}
		
		for (Character c : countDupChar.keySet()) {
			if(countDupChar.get(c) > 1) {
				System.out.println("Character duplicate is: " + c);
			}
		}
	}
	
	public static void main(String[] args) {
		
		/*
		 * Question 5 : How to find duplicate characters in String in java?
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string: ");
		String str = sc.nextLine();
		
		findDuplicateCharacters(str);
		
	}
}
