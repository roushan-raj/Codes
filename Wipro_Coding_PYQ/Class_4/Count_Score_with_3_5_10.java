import java.util.Arrays;

public class Count_Score_with_3_5_10 {
	
	int i;
	public int count(int n) {
		int [] ways = new int [n+1];
		Arrays.fill(ways, 0);
		ways[0] = 1;
		
		for(i = 3; i<=n; i++)
			ways[i] = ways[i] + ways[i-3];
		for(i = 5; i<=n; i++)
			ways[i] = ways[i] + ways[i-5];
		for(i = 10; i<=n; i++)
			ways[i] = ways[i] + ways[i-10];
		
		return ways[n];
	}

	public static void main(String[] args) {
		Count_Score_with_3_5_10 ob = new Count_Score_with_3_5_10();
		System.out.println("No of possiible ways is: "+ob.count(8));
		System.out.println("No of possiible ways is: "+ob.count(20));
		System.out.println("No of possiible ways is: "+ob.count(13));
	}
}
