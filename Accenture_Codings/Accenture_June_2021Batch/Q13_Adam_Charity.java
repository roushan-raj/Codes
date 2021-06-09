
public class Q13_Adam_Charity {
	
	public static long fingCoins(int n) {
		long coin = 0;
		
		for(int i=1; i<=n; i++) {
			coin  = coin + (i*i);
		}
		
		return coin;
	}

	public static void main(String[] args) {
		int n = 2;
		System.out.println(fingCoins(n));
	}
}
