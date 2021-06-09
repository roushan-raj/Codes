
import java.util.*;

public class CheckGivenStringIsPalindrome {
	
	public boolean isPalindrome(String word) {
		char [] charArray = word.toCharArray();
		int start = 0;
		int end = charArray.length-1;
		while(start<end) {
			if (charArray[start] != charArray[end]) {
				return false;
			}
			start++;
			end--;
		}
		return true;	
	}

	public static void main(String[] args) {
		 
		CheckGivenStringIsPalindrome pal = new CheckGivenStringIsPalindrome();
	
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter a word : ");
		String word = kb.next();
		kb.close();
		
		//String word = "madam";
		boolean res = pal.isPalindrome(word);
		System.out.println("Is this given word is Palindrome : " + res);

	}

}
