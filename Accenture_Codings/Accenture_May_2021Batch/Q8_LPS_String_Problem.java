
public class Q8_LPS_String_Problem {
	
	public static int lps(String str) {
		
		StringBuilder sb = new StringBuilder(str);
		String rev_str = sb.reverse().toString();
		
		return lcs(str, rev_str);
	}
	
	public static int lcs(String str1, String str2) {
		int n = str1.length();
		int m = str2.length();
		
		int [][] dp = new int [n+1][m+1];
		
		for(int i=1; i<dp.length; i++) {
			for(int j=1; j<dp[0].length; j++) {
				if(str1.charAt(i-1) == str2.charAt(j-1)) {
					dp[i][j] = 1 + dp[i-1][j-1];
				}
				else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		return dp[n][m];
	}

	public static void main(String[] args) {
		
		System.out.println(lps("umeayinifd"));
	}
}
