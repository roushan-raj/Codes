
public class Q17_SumOfAllNumINRangeDivisibleBy7 {
	
	public static int findSum(int n, int m) {
		int sum = 0;
		for(int i=n; i<=m; i++) {
			if(i % 7 == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		
		System.out.println(findSum(1, 20));
	}
}
