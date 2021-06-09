
public class Q2_Power_of_X_and_n {
	
	public double myPow(double x, int n) {
		double ans = 1.0;
		long nn = n;
		if (nn < 0) { 
			nn = -1 * nn;
		}
		while (nn > 0) {
			if (nn%2 == 1) {
				ans = ans * x;
				nn = nn-1;
			} else {
				x = x * x;
				nn = nn/2;
			}
		}
		if (n < 0) {
			ans = (double) (1.0) / (double) (ans);
		}
		return ans;
	}

	public static void main(String[] args) {
		 
		Q2_Power_of_X_and_n ob = new Q2_Power_of_X_and_n();
		System.out.println("Calculated value of power is : " + ob.myPow(2, 10));

	}

}
