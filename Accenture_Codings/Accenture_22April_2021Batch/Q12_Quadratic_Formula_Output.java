
public class Q12_Quadratic_Formula_Output {
	
	static int value = 0;
    public static int quadratic(int a, int b, int c) {
    	value = value + (a*a) + (b*b) + (c*c) + (2*a*b) + (2*b*c) + (2*c*a);
    	
    	return value;
    }

	public static void main(String[] args) {
		System.out.println(quadratic(3,-6,12));
	}
}
