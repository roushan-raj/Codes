
public class DP_1_FabonacciSeries_BottomUp {
	
	public int fib(int x) {
		int [] table = new int[x+1];
		table[0] = 0;
		table[1] = 1;
		
		for(int i=2; i<=x; i++) {
			table[i] = table[i-1] + table[i-2];
		}
		return table[x];
	}

	public static void main(String[] args) {
		 
		DP_1_FabonacciSeries_BottomUp ob = new DP_1_FabonacciSeries_BottomUp();
		
		System.out.println("Value at required position is :- " + ob.fib(6));

	}

}
