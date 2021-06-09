
public class Q10_Caesar_Cipher_String {
	
	public static void addNumberToChar(String str) {
		if(str.length() == 0) {
			return;
		}
		
		String ans = "";
		for(int i=0; i<str.length(); i++) {
			int curr = str.charAt(i);
			int new_Char = curr + 3;
			if(new_Char > 122) {
				new_Char = new_Char - 26;
			}
			
			ans = ans + (char)new_Char;
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {
		String str = "nrfzh";
		addNumberToChar(str);
	}
}
