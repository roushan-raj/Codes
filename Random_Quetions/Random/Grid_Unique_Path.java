
public class Grid_Unique_Path {
	
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
		 
		Grid_Unique_Path ob = new Grid_Unique_Path();
		System.out.print(ob.uniquePath(2,3));
	}
}
