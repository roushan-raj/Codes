
public class Q8_Minima_Maxima_QuadraticEquation {
	
	public static void findMaximaMinima(int a, int b, int c) {
		int x = Integer.MAX_VALUE;
		if(a > 0) {
			x = (4*a*c - b*b) / (4*a);
		}
		if(a < 0) {
			x = (4*a*c - b*b) / (4*a);
		}
		System.out.println(x);
	}

	public static void main(String[] args) {
		findMaximaMinima(-2, -8, 10);
	}
}
