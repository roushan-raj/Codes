

///////////////////// Solving with recursion ////////////////////

import java.util.*;
public class All_Permutations_of_string_with_some_repeating_character {
	
	public static void permutations(String str, String perm) {
		if(str.length() == 0) {
			System.out.println(perm);
			return;
		}
		
		Set<Character> set = new HashSet<>();
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if(!set.contains(ch)) {
				String ros = str.substring(0, i) + str.substring(i+1);
				set.add(ch);
				permutations(ros, perm+ch);
			}
		}
	}

	public static void main(String[] args) {
		
		String str = "AAC";
		permutations(str,"");
	}
}
