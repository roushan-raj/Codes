
public class Q18_Min_Jump_to_reach_Zero {
	
	public static int findMinJump(int n) {
		int [] dp = new int [n+1];
		
		dp[0] = 0;
		dp[1] = 1;
		
		for(int i=2; i<=n; i++) {
			if(i % 2 == 1) {
				dp[i] = 1 + dp[i-1];
			}
			else {
				
				int max = i/2;
				int ans = Integer.MAX_VALUE;
				
				for(int j=1; j<= max; j++) {
					ans = Math.min(ans, 1+dp[i-j]);
				}
				dp[i] = ans;
			}
		}
		return dp[n];
	}

	public static void main(String[] args) {
		int n = 10;
		System.out.println(findMinJump(n));
	}

}
