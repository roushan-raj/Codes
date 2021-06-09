
public class Q19_Sum_of_N_Terms_in_GP {
	
	public static double sumOfNtermsInGP(double second, double third, int n) {
		double r = third / second;
		double first = second / r;
		double pow = Math.pow(r, n) - 1;
		
		double sumOfnthTerm = (first * pow) / (r - 1);
		
		return sumOfnthTerm;
	}

	public static void main(String[] args) {
		
		System.out.println(sumOfNtermsInGP(1, 2, 5));
	}
}
