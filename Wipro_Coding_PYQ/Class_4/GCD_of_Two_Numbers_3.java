
public class GCD_of_Two_Numbers_3 {
	
	// Euclidean algorithm with "%" modulo operator
	public int gcd(int a, int b) {
		if(b == 0)
			return a;
		return gcd(b, a%b);
	}

	public static void main(String[] args) {
		GCD_of_Two_Numbers_3 ob = new GCD_of_Two_Numbers_3();
		System.out.println("GCD is: "+ob.gcd(1, 0));
	}
}
