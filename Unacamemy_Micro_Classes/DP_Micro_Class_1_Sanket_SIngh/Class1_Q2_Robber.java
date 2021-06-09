import java.util.Arrays;

public class Class1_Q2_Robber {
	
	// Top-down approach
	public static int lootHouseTD(int [] arr, int [] dp, int i) {
		if(i == 0) {
			dp[0] = arr[0];
		}
		if(i == 1) {
			dp[1] = Math.max(arr[0], arr[1]);
		}
		if(dp[i] != -1) {
			return dp[i];
		}
		return dp[i] = Math.max(lootHouseTD(arr, dp, i-1), lootHouseTD(arr, dp, i-2)+arr[i]);
	}
	
	// Bottom-up approach
	public static int lootHouseBU(int n, int [] arr) {
		int [] dp = new int [n];
		Arrays.fill(dp, -1);
		dp[0] = arr[0];
		dp[1] = Math.max(arr[0], arr[1]);
		
		for(int i=2; i<arr.length; i++) {
			dp[i] = Math.max(dp[i-1], dp[i-2]+arr[i]);
		}
		return dp[n-1];
	}

	public static void main(String[] args) {
		int [] arr = new int [] {2, 7, 9, 3, 1};
		int [] dp = new int [arr.length];
		Arrays.fill(dp, -1);
		System.out.println(lootHouseTD(arr, dp, arr.length-1));
		System.out.println(lootHouseBU(arr.length, arr));
	}
}
