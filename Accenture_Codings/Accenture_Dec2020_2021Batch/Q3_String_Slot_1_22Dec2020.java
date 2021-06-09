
public class Q3_String_Slot_1_22Dec2020 {
	
	public static char And(char ch1, char ch2) {
		if(ch1 == '1' && ch2 == '1')
			return '1';
		return '0';
	}
	
	public static char Or(char ch1, char ch2) {
		if(ch1 == '0' && ch2 == '0')
			return '0';
		return '1';
	}
	
	public static char Xor(char ch1, char ch2) {
		if(ch1 == ch2)
			return '0';
		return '1';
	}
	
	public static int findOperations(String str) {
		if(str.length() == 0) {
			return -1;
		}
		
		char ans = str.charAt(0);
		
		for(int i=1; i<str.length(); i+=2) {
			
			char operation = str.charAt(i);
			
			char ans2 = str.charAt(i+1);
			
			if(operation == 'A') {
				ans = And(ans, ans2);
			}
			if(operation == 'B') {
				ans = Or(ans, ans2);
			}
			if(operation == 'C') {
				ans = Xor(ans, ans2);
			}
		}
		return ans == '1' ? 1 : 0;
	}

	public static void main(String[] args) {
		String str = "1C0C1C1A0B1";
		String str1 = "0C1A1B1C1C1B0A0";
		System.out.println(findOperations("1A1C0"));
	}
}
