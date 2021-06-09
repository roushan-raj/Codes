
public class Q11_Count_coPrimes_to_GivenNum {
	
	public static int getAllCoPrimes(int n) {
		int count = 0;
		
		for(int i=1; i<=n; i++) {
			if(calculateGCD(i, n) == 1) {
				count++;
			}
		}
		return count;
	}
	
	public static int calculateGCD(int a, int b) {
		if(b == 0)
			return a;
		return calculateGCD(b, a%b);
	}

	public static void main(String[] args) {
		
		System.out.println(getAllCoPrimes(16));
	}
}
