
public class Q52_Count_Palindromes_In_String {
	
	public static int countPalindrome(String str) {
		String words [] = str.split(" ");
		int count = 0;
		
		for(int i=0; i<words.length; i++) {
			String curr = words[i];
			
			String reverse = new StringBuffer(curr).reverse().toString();
			if(curr.equals(reverse)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String str = "this is level 71";
		System.out.println(countPalindrome(str));
	
	}
}
