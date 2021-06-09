
public class Reverse_words_of_Sentence {
	
	    static public String reverseString(String s) {
		int n = s.length();
		String ans = "";
		int i = n-1;
		
		while(i>=0) {
		
			while(i >= 0 && s.charAt(i) == ' ') i--;
			
			int j = i;
			if(i<0)            // to avoid starting blank spaces
				break;
			
			while(i >=0 && s.charAt(i) != ' ') i--;
			
			if(ans.isEmpty()) {
				ans = ans.concat(s.substring(i+1, j+1));
			}
			else {
				ans = ans.concat(" "+s.substring(i+1, j+1));
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		String str = "  The sky   is blue    ";
		System.out.println(reverseString(str));
	}
}
