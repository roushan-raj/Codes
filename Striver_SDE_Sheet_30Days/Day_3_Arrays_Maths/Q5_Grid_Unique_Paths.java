
public class Q5_Grid_Unique_Paths {
	
	public int uniquePaths(int m, int n) {
		int N = n + m - 2;
		int r = m - 1;
		double res = 1;
		for (int i = 1; i<=r; i++) {
			res = res * (N - r + i) / i;
		}
		return (int)res;
	}

	public static void main(String[] args) {
		
		Q5_Grid_Unique_Paths ob = new Q5_Grid_Unique_Paths();
		System.out.println("Total no.of possible paths is : " + ob.uniquePaths(3, 2));

	}

}
