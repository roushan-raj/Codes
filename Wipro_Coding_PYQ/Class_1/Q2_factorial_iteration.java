
public class Q2_factorial_iteration {
	
	int result = 1;
	public int factorial(int n) {
		
//		if(n == 0)
//			return 1;
		
		for(int i=1; i<=n; i++) {
			result = result * i;
		}
		return result;
	}

	public static void main(String[] args) {
		Q2_factorial_iteration ob = new Q2_factorial_iteration();
		System.out.println("Value is: "+ob.factorial(5));
	}
}
