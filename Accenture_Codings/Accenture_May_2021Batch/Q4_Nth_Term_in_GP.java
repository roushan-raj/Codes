
public class Q4_Nth_Term_in_GP {
	
	public static double nthTermInGP(double second, double third, int n) {
		double r = third/second;
		double first = second / r;
		
		double nthTerm = first * (Math.pow((r), (n-1)));
		
		return nthTerm;
	}

	public static void main(String[] args) {
		
		System.out.println(nthTermInGP(1,2,5));
	}
}