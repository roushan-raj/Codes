
public class Q6_Rotate_Matrix_by_90_Degree {
	
	public void rotate (int [][] matrix) {
		for (int i=0; i<matrix.length; i++) {
			for (int j=i; j<matrix[0].length; j++) {
				int temp = 0;
				temp = matrix[i][j]; 
                matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		for (int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix.length/2; j++) {
				int temp = 0;
				temp = matrix[i][j];
				matrix[i][j] = matrix[i][matrix.length-1-j];
				matrix[i][matrix.length-1-j] = temp;
			}
		}
	}
	
	public void printMatrix(int [][] matrix) {
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix.length; j++) {
				System.out.print(matrix[i][j] +"," + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		 
		Q6_Rotate_Matrix_by_90_Degree ob = new Q6_Rotate_Matrix_by_90_Degree();
		int matrix [][] = new int [][] {{5,1,9,11}, 
			                                          {2,4,8,10}, 
			                                          {13,3,6,7}, 
			                                          {15,14,12,16}};
	    ob.rotate(matrix);
	    ob.printMatrix(matrix);

	}

}
