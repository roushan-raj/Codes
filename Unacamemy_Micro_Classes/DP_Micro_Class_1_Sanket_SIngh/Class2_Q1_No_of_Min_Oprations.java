
public class Class2_Q1_No_of_Min_Oprations {
	
	public static int minStepsToOneTD(int n, int [] dp) {
		if(n == 2 || n == 3) return 1;
		if(n == 1) return 0;
		if(n < 1) return Integer.MAX_VALUE;
		if(dp[n] != 0) return dp[n];
		
		int div_by_3 = Integer.MAX_VALUE;
		int div_by_2 = Integer.MAX_VALUE;
		int sub_by_1 = Integer.MAX_VALUE;
		
		if(n%3 == 0) {
			div_by_3 = 1 + minStepsToOneTD(n/3, dp);
		}
		if(n%2 == 0) {
			div_by_2 = 1 + minStepsToOneTD(n/2, dp);
		}
		sub_by_1 = 1 + minStepsToOneTD(n-1, dp);
		return dp[n] = Math.min(Math.min(div_by_3, div_by_2), sub_by_1);
	}

	public static void main(String[] args) {
		int n = 11;
		int [] dp = new int [n+1];
		System.out.println(minStepsToOneTD(n, dp));
	}
}




