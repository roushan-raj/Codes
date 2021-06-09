import java.util.*;
public class Q3_Method1_MostOptimal {
	
	public List<List<String>> Partition(String str){
		List<List<String>> result = new ArrayList<>();
		List<String> extractedPalindrome = new ArrayList<>();
		recursiveFunction(0, str, extractedPalindrome, result);
		return result;
	}
	
	public void recursiveFunction(int index, String str, List<String> extractedPalindrome, List<List<String>> result) {
		int n = str.length();
		if(index == n) {
			result.add(new ArrayList<>(extractedPalindrome));
			return;
		}
		
		for(int i = index; i<n; i++) {
			if (isPalindrome(str, index, i)) {
				extractedPalindrome.add(str.substring(index, i+1));
				recursiveFunction(i+1, str, extractedPalindrome, result);
				extractedPalindrome.remove(extractedPalindrome.size()-1);
			}
		}
	}
	
	public boolean isPalindrome(String str, int start, int end) {
		while(start <= end) {
			
			if(str.charAt(start) != str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

	public static void main(String[] args) {
		Q3_Method1_MostOptimal ob = new Q3_Method1_MostOptimal();
		String str = "aabb";
		System.out.println(ob.Partition(str));
	}
}
