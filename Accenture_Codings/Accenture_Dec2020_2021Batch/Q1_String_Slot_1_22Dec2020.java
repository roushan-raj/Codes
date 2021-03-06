
public class Q1_String_Slot_1_22Dec2020 {
	
	public static boolean validPassword(String str) {
		int numCounts = 0;
		int capCounts = 0;
		
		if(str.length() < 4) {
			return false;
		}
		
		if(str.charAt(0) >= 48 && str.charAt(0) <= 57) {
			return false;
		}
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == ' ' || str.charAt(i) == '/') {
				return false;
			}
			if(str.charAt(i) >= 48 && str.charAt(i) <= 57) {
				numCounts++;
			}
			if(str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				capCounts++;
			}
		}
		
		if(numCounts > 0 && capCounts > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		String str = "hA1F";
		System.out.println(validPassword(str));
	}
}
