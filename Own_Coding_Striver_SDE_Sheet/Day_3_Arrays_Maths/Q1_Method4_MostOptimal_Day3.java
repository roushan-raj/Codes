
public class Q1_Method4_MostOptimal_Day3 {
	
	public boolean searchTarget(int[][]mat, int x) {
		int row = mat.length;
		int col = mat[0].length;
		int high = (row * col) - 1;
		int low = 0;
		
		while(low<=high) {
			int mid = (high+low)/2;
			if(mat[mid/col][mid%col] == x) {
				System.out.println("Element is present");
				return true;
			}
			else if(mat[mid/col][mid%col] > x) {
				high = mid-1;
			}
			else {
				low = mid+1;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		 
		Q1_Method4_MostOptimal_Day3 ob = new Q1_Method4_MostOptimal_Day3();
		int [][] mat = new int [][] {{1,3,5,7},
									 {10,11,16,20},
									 {23,30,34,50}};
		System.out.print(ob.searchTarget(mat, 50));							            

	}

}
