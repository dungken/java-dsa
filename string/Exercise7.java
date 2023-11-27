
public class Exercise7 {
	public static void findAllSubstrings(String str) {
		for(int i = 0; i < str.length(); i++) {
			for(int j = i + 1; j <= str.length(); j++) {
				System.out.println(str.substring(i, j));
			}
		}
	}
	
	public static void main(String[] args) {
		/*
		 * Question 7 : Find all substrings of String in java?
		 * abb => a, b, b, ab, bb, abb
		 * 
		 */
		
		findAllSubstrings("abb");
	}
}
