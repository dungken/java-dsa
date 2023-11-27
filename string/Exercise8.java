
public class Exercise8 {
	public static int lengthString1(String str) {
		int count = 0;
		char[] arrStr = str.toCharArray();
		for (char c : arrStr) {
			++count;
		}
		return count;
	}
	public static int lengthString2(String str) {
		int i = 0;
		try {
			for(i = 0; ; i++) {
				str.charAt(i);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return i;
	}
	
	
	public static void main(String[] args) {
		/*
		 * Question 8 : Find length of String without using any inbuilt method in java?
		 */
		
		System.out.println("String length: " + lengthString1("Find length of String without using any inbuilt method in java?"));
		System.out.println("String length: " + lengthString2("Find length of String without using any inbuilt method in java?"));
	}
}
