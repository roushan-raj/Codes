

/////////////////// Solving with recursion /////////////////////

public class All_Permutations_of_string_without_repeating_characters {
	
	public static void permutations(String str, String perm) {
		if(str.length() == 0) {
			System.out.println(perm);
			return;
		}
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			String ros = str.substring(0, i) + str.substring(i+1);
			permutations(ros, perm+ch);
		}
	}

	public static void main(String[] args) {
		
		String str = "ABC";
		permutations(str, "");
	}
}
