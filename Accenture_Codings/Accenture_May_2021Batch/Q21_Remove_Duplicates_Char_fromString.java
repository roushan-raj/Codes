import java.util.*;
public class Q21_Remove_Duplicates_Char_fromString {
	
	public static String removeDuplicates(String str) {
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		String ans = "";
		
		for(int i=0; i<str.length(); i++) {
			set.add(str.charAt(i));
		}
		
		for(Character ch : set) {
			ans = ans + ch;
		}
		return ans;
	}

	public static void main(String[] args) {
		
		String str = "CsharpstarZ";
		System.out.println(removeDuplicates(str));
	}
}
