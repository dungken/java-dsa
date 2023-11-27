import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Exercise6 {
	// Using indexOf & lastIndexOf
	public static char findFistNonRepeatedChar(String str) {
		/*
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(str.indexOf(c) == str.lastIndexOf(c)) {
				return c;
			}
		}
		return 0;
		*/
		
		char[] arrStr = str.toCharArray();
		for (int i = 0; i < arrStr.length; i++) {
			if(str.indexOf(arrStr[i]) == str.lastIndexOf(arrStr[i])) 
				return arrStr[i];
		}
		return 0;
	}
	
	// Using LinkedHashMap
	public static char findFistNonRepeatedChar2(String str) {
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		
		for (Character m : map.keySet()) {
			if(map.get(m) == 1) 
				return m;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		/*
		 * Question 6 : Find first non repeated character in String in java?
		 * kitudautienkhonglap
		 * dungd
		 */
		
		String s = "kitudautienkhonglap";
		System.out.println("Find first non repeated character is: " + findFistNonRepeatedChar(s));
		System.out.println("Find first non repeated character is: " + findFistNonRepeatedChar2(s));
	}
}
