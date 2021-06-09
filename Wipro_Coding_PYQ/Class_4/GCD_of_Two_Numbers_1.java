
public class GCD_of_Two_Numbers_1 {
	
	int gcd;
	public int gcd(int a, int b) {
		
		if(a == 0)
			return b;
		if(b == 0)
			return a;
		
		for(int i=1; i<=a && i<=b; i++) {
			if(a%i == 0 && b%i == 0) {
				gcd = i;
			}
		}
		return gcd;
	}

	public static void main(String[] args) {
		GCD_of_Two_Numbers_1 ob = new GCD_of_Two_Numbers_1();
		System.out.println("GCD is: "+ob.gcd(20, 28));
	}
}
