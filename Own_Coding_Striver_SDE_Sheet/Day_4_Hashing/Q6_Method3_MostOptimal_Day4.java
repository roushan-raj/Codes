
import java.util.*;
public class Q6_Method3_MostOptimal_Day4 {
	
	public int nonRepeatingSubString(String arr) {
		
		Map<Character, Integer> map = new HashMap<>();
		int left =0, right =0, length =0, n = arr.length();
		
		while(right<n) {
			if(map.containsKey(arr.charAt(right))) 
				left = Math.max(map.get(arr.charAt(right))+1, left);
			
			map.put(arr.charAt(right), right);
			
			length = Math.max(length, right-left+1);
			right++;
		}
		return length;
	}

	public static void main(String[] args) {
		
		Q6_Method3_MostOptimal_Day4 ob  = new Q6_Method3_MostOptimal_Day4();
		String str = "abcaabcdeba";
		System.out.print("Longest substring length is: "
		                                    +ob.nonRepeatingSubString(str));
	}
}
