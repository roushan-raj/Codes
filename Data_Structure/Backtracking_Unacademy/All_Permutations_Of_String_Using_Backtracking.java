import java.util.HashSet;
import java.util.Set;

public class All_Permutations_Of_String_Using_Backtracking {	
	
	static int count=0;
	public static int stringPermutations(String str, int j) {
		// Base case
		if(str.length()-1 == j) {
			System.out.println(str);
			count++;
			return 0;
		} 
		
		Set<Character> set = new HashSet<>();
		
		for(int i=j; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			if(!set.contains(ch)) {
				str = swap(str, i, j);
				stringPermutations(str, j+1);
				set.add(ch);
				str = swap(str, i, j);       // important step in backtracking (retain original state)
			}
		}
			
	    return count;
	}
	public static String swap(String str, int i, int j) {
		char ch [] = str.toCharArray();
		char temp = ch[i];
		    ch[i] = ch[j];
		    ch[j] = temp;
		    return String.valueOf(ch); 
	}

	public static void main(String[] args) {
		
		String str = "aab";
		System.out.println("Total Permutations: "+stringPermutations(str, 0));	
	}
}
