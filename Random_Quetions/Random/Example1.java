
public class Example1 {
	
	public static int gcd(int n, int m) {
		if(m == 0) {
			return n;
		}
		return gcd(m, n%m);
	}

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
		System.out.println(maxRowSum);
		
		for(int j=0; j<cols; j++) {
			
			int sumCol = 0;
					
			for(int i=0; i<rows; i++) {
				sumCol = sumCol + matrix[i][j];
			}
			maxColSum = Math.max(maxColSum, sumCol);
		}
		System.out.println(maxColSum);
		return gcd(maxRowSum, maxColSum);
	}
		
	public static void main(String [] args) {
		int [][] matrix =  {{2, 3, 3},
		           			{4, 5, 9},
		           			{5, 1, 3}};
		          
		System.out.println(findSum(matrix));
 	}
}  