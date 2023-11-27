
public class Exercise4 {
	public static boolean isRotationOfAnotherString(String str, String strRotation) {
		String string = str + str;
		if(string.contains(strRotation)) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		/*
		 * Question 4 : How to check if one String is rotation of another String in java?
		 */
		
		System.out.println("java2blog and blogjava2 are rotation of each other : " + isRotationOfAnotherString("java2blog", "blogjava2"));
        System.out.println("java2blog and avablog2j are rotation of each other : " + isRotationOfAnotherString("java2blog", "avablog2j"));
	}
}
