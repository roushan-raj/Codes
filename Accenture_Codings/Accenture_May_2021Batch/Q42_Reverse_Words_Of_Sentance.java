
public class Q42_Reverse_Words_Of_Sentance {
	
	public static void reverseWords(String str) {
		if(str.length() == 0) {
			return;
		}
		
		String [] words = str.split(" ");
		
		String ans = "";
		for(int i=words.length-1; i>=0; i--) {
			ans = ans + words[i]+" ";
		}
		System.out.println(ans.substring(0, ans.length()-1));
	}

	public static void main(String[] args) {
		String str = "Welcome to mettl";
		reverseWords(str);
	}
}
