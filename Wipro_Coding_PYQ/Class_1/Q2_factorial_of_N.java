
public class Q2_factorial_of_N {
	
	//int result = 1;
	public int factorial(int n) {
		if(n == 0)
			return 1;
		
		int result = n*factorial(n-1);
		
		return result;
	}

	public static void main(String[] args) {
		Q2_factorial_of_N ob = new Q2_factorial_of_N();
		System.out.println("Value is: "+ob.factorial(0));
	}
}
