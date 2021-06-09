
///////////////////////// Using Memoization /////////////////////////

public class DP_2_FabonacciSeries_TopDown {
	
	public int fib(int memo[], int n) {
		if(memo[n] == 0) {
			if(n < 2) {
				memo[n] = n;
			} else {
				int left = fib(memo, n-1);
				int right = fib(memo, n-2);
				memo[n] = left+right;
			}	
		}
		return memo[n];
	}

	public static void main(String[] args) {
		 
		DP_2_FabonacciSeries_TopDown ob = new DP_2_FabonacciSeries_TopDown();
		
		System.out.println("Value at required position is :- " + ob.fib(new int[7+1], 7));

	}

}
