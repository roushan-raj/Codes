
public class GCD_of_Two_Numbers_2 {
	
	// Euclidean algorithm
	public int gcd(int a, int b) {
		if(a == 0)
			return b;
		if(b == 0)
			return a;
		if(a == b)
			return a;
		
		if(a<b)
			return gcd(a, b-a);
		return gcd(a-b, b);
	}

	public static void main(String[] args) {
		GCD_of_Two_Numbers_2 ob = new GCD_of_Two_Numbers_2();
		System.out.println("GCD is: "+ob.gcd(20, 21));
	}
}
