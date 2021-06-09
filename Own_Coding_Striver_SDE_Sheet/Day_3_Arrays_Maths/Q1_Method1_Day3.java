
public class Q1_Method1_Day3 {
	
	public boolean searchElement(int[][]mat, int target) {
		int n = mat.length;
		int m = mat[0].length;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m;j++) {
				if (mat[i][j] == target) 
					return true;	
			}
		}
		return false;
	}

	public static void main(String[] args) {
		 
		Q1_Method1_Day3 ob = new Q1_Method1_Day3();
		int [][] mat = new int [][] {{1,3,5,7},
		                                         {10,11,16,20},
		                                         {23,30,34,50}};
		System.out.print(ob.searchElement(mat, 30));                                         
	}

}
