import java.util.*;
public class Q6_Method2_Day4 {
	
	public int longestSubString(String str) {
		int left = 0, right = 0, length = 0, n = str.length();
		HashSet<Character> hash = new HashSet<>();
		
		while(right<n) {
			while(hash.contains(str.charAt(right))) {
				hash.remove(str.charAt(left));
			    left++;
			}
			hash.add(str.charAt(right));
			length = Math.max(length, right-left+1);
			right++;
		}
		return length;
	}

	public static void main(String[] args) {
		Q6_Method2_Day4 ob = new Q6_Method2_Day4();
		String str = "abcaabcdeba";
		System.out.println(ob.longestSubString(str));
	}
}
