
public class Q17_LDS {
	
	public static int longestLDS(int [] nums, int n) {
		int [] dp = new int [n];
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<n; i++) {
			dp[i] = 1;
		}
		
		for(int i=1; i<n; i++) {
			for(int j=0; j<i; j++) {
				if(nums[i] < nums[j] && dp[i] < dp[j] + 1) {
					dp[i] = dp[j] + 1;
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			max = Math.max(max, dp[i]);
		}
		
		return max;
	}

	public static void main(String[] args) {
		
		int [] arr = {1, 3, 2};
		System.out.println(longestLDS(arr, arr.length));
	}

}
