
public class Reverse_Letters {
	
	public void reverseLetters(String str) {
		int n = str.length();
		
		for(int i=0; i<n; i++) {
			int ch = str.charAt(i);
			
			if (ch >= 97 && ch <= 122) {
				int rev = 219 - ch;
				System.out.print(Character.toString((char) rev));
			} 
			else {
				return;
			}
		}
	}

	public static void main(String[] args) {
		Reverse_Letters ob = new Reverse_Letters();
		String str1 = "cast";
		String str2 = "knowledge";
		ob.reverseLetters(str1);
		
		System.out.println();
		
		ob.reverseLetters(str2);
	}
}
