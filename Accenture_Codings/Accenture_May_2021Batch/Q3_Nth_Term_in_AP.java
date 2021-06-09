
public class Q3_Nth_Term_in_AP {
	
	public static int nthTermAP(int second, int third, int n) {
		int cd = third - second;
		int first = second - cd;
		
		int nthTerm = first + (n-1) * cd;
		
		return nthTerm;
	}

	public static void main(String[] args) {
		
		System.out.println(nthTermAP(1, 2, 4));
	}
}
