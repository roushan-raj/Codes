
public class Q9_String {
	
	public static void stringCheck(String str) {
		if(str.length() == 0) {
			System.out.println(-1);
		}
	
		String firstHalf = "";
		String secondHalf = "";
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) >='0' && str.charAt(i) <= '9') {
				firstHalf = firstHalf + str.charAt(i);
			}
			else {
				secondHalf = secondHalf + str.charAt(i);
			}
		}
		if(secondHalf.length() == Integer.parseInt(firstHalf)) {
			System.out.println("TRUE");
			System.out.println(secondHalf.length());
		}
		else {
			System.out.println("FALSE");
			System.out.println(secondHalf.length());
		}
	}

	public static void main(String[] args) {
		String str = "11Thinktostart";
		stringCheck(str);
	}
}

