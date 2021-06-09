
public class Q26_Maximum_sum_In_Martix_Row_Col_Wise {
	
	public static int  findSum(int [][] matrix) {
		
		int maxRowSum = 0;
		int maxColSum = 0;
		
		int rows = matrix.length;
		int cols = matrix[0].length;
		
		for(int i=0; i<rows; i++) {
			
			int sumRow = 0;
					
			for(int j=0; j<cols; j++) {
				sumRow = sumRow + matrix[i][j];
			}
			maxRowSum = Math.max(maxRowSum, sumRow);
			
		}
		
		for(int j=0; j<cols; j++) {
			
			int sumCol = 0;
					
			for(int i=0; i<rows; i++) {
				sumCol = sumCol + matrix[i][j];
			}
			maxColSum = Math.max(maxColSum, sumCol);
			
		}
		return maxRowSum + maxColSum;
	}

	public static void main(String[] args) {
		
		int [][] matrix = {{1, 2},
				           {5, 6}};
				          
		System.out.println(findSum(matrix));

	}

}
