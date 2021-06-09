
public class Q2_Prime_Factors_of_Given_No {
	
	public void primeFactors(int n) {
		if(n == 0 || n < 0) {
			return;
		}
		while(n%2 == 0) {
			System.out.print(2+" ");
			n = n/2;
		}
		for(int i=3; i<=Math.sqrt(n); i+=2) {
			while(n%i == 0) {
				System.out.print(i+" ");
				n = n/i;
			}
		}
		if(n > 2) {
			System.out.print(n);
		}
	}

	public static void main(String [] args) {
		Q2_Prime_Factors_of_Given_No ob = new Q2_Prime_Factors_of_Given_No();
		ob.primeFactors(20);
	}
}
