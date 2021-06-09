
public class Q1_Search_in_a_2D_matrix {
	
	public boolean searchKey(int [][] matrix, int target) {
		if(matrix.length == 0) {
			return false;
		}
		int n = matrix.length;
		int m = matrix.length;
		int low = 0;
		int high = (n * m) - 1;
		
		while(low <= high) {
			int mid = (low + (high - low)/2);
			if (matrix[mid/m][mid%m] == target) {
				return true;
			}
			if (matrix[mid/m][mid%m] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		 
		Q1_Search_in_a_2D_matrix ob = new Q1_Search_in_a_2D_matrix();
		int matrix [][] = new int [][] {{1,3,5,7}, 
											          {10,11,16,20}, 
											          {23,30,34,50}};
		System.out.println(ob.searchKey(matrix, 30));									          

	}

}
