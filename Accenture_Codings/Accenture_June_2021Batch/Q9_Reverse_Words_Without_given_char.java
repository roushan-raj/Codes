
public class Q9_Reverse_Words_Without_given_char {
	
	public static void reverseWords(String str, char ch) {
		if(str.length() == 0) {
			return;
		}
		
		String [] words = str.split(" ");
		
		String ans = "";
		for(int i=words.length-1; i>=0; i--) {
			
			String word = words[i];
			String temp = "";
			
			for(int j=0; j<word.length(); j++) {
				if(word.charAt(j) != ch) {
					temp = temp+word.charAt(j);
				}
				else {
					continue;
				}
			}
			ans = ans + temp +" ";
		}
		System.out.println(ans.substring(0, ans.length()-1));
	}

	public static void main(String[] args) {
		String str = "Welcome to mettl";
		reverseWords(str, 'l');
	}
}
