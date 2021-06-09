
public class Q5_Method1_Day3 {
	
	public int uniquePath(int i, int j,int n, int m) {
		if(i ==(n-1) && j==(m-1))
			return 1;
		if(i>=n || j>=m)
			return 0;
		
		return uniquePath(i,j,i+1,j) + uniquePath(i,j,i,j+1);
	}

	public static void main(String[] args) {
		 
		Q5_Method1_Day3 ob = new Q5_Method1_Day3();
		System.out.print(ob.uniquePath(0, 0, 2, 3));
	}
}
