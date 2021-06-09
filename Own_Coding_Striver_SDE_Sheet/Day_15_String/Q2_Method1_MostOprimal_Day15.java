
public class Q2_Method1_MostOprimal_Day15 {
	
	public String longestPalindrome(String s) {
		if(s != null && s.length() <= 1) {
			return s;
		}
		
		int len =0, len1 =0, len2 =0, start =0, end =0;
		int n = s.length();
		
		for(int i=0; i<n; i++) {
			len1 = expandArounderCenter(s, i, i);
			len2 = expandArounderCenter(s, i, i+1);
			len = Math.max(len1, len2);
			
			if(len > end-start) {
				start = i - (len - 1)/2;
				end = i + len/2;
			}
		}
		return s.substring(start, end+1);
	}
	
	public int expandArounderCenter(String s, int i, int j) {
		while(i>=0 && j<s.length() && s.charAt(i) == s.charAt(j)) {
			i--;
			j++;
		}
		return j-1-i;
	}

	public static void main(String[] args) {
		Q2_Method1_MostOprimal_Day15 ob = new Q2_Method1_MostOprimal_Day15();
		String str = "GOOGLE";
		System.out.println(ob.longestPalindrome(str));
	}
}
