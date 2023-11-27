import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exercise9 {

	public static String insertFirstCharAtDiffPlaces(String perm, char firstChar, int index) {
		// Inserting firstCharacter of orig String at difference places based on index
		return perm.substring(0, index) + firstChar + perm.substring(index);
	}

	public static Set permutationOfString(String str) {
		Set<String> permutationSet = new HashSet<String>();
		if (str.length() == 0) {
			permutationSet.add("");
			return permutationSet;
		}

		// take out first character of String
		char c = str.charAt(0);
		// Remaining String
		String rem = str.substring(1);

		Set<String> permutatedSetForRemainingString = permutationOfString(rem);

		for (String permutedString : permutatedSetForRemainingString) {
			for (int j = 0; j <= permutedString.length(); j++) {
				String permutation = insertFirstCharAtDiffPlaces(permutedString, c, j);
				permutationSet.add(permutation);
			}

		}

		return permutationSet;
	}

	public static void main(String[] args) {
		/*
		 * Question 9 : Write a program to print all permutations of String in java?
		 */

		Set<String> set = permutationOfString("ABC");
		System.out.println("Permutations of String ABC are:");
		
		for (Iterator<String> iterator = set.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		
		
		
	}
}
