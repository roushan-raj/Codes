
public class Q1_Method2_Day3 {
	
	public boolean searchTarget(int[][]mat, int x) {
		int row = mat.length;
		int col = mat[0].length;
		int i=0;
		
		while(i<row) {		
			int low = 0; int high = col-1;
			
			while(low <= high) {
				int mid = (low+high)/2;
				if(mat[i][mid] == x)
					return true;
				else if(mat[i][mid] > x)
					high = mid-1;
				else 
					low = mid+1;
			}
			i++;
		}
		return false;
	}
	public static void main(String[] args) {
		 
		Q1_Method2_Day3 ob = new Q1_Method2_Day3();
		int [][] mat = new int [][] {{1,3,5,7},
									 {10,11,16,20},
									 {23,30,34,50}};
		System.out.print(ob.searchTarget(mat, 10));							              
	}
}
