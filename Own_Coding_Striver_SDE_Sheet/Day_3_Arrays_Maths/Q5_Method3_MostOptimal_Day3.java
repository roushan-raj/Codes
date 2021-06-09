
public class Q5_Method3_MostOptimal_Day3 {
	
	public int uniquePath(int n, int m) {
		int N = m+n-2;
		int r = m-1;
		double res = 1;
		for(int i=1; i<=r; i++) {
			res = res * (N-r+i)/i;
		}
		return (int) res;	
	}

	public static void main(String[] args) {
		 
		Q5_Method3_MostOptimal_Day3 ob = new Q5_Method3_MostOptimal_Day3();
		System.out.print(ob.uniquePath(2,3));
	}
}
