
public class Q6_Method2_MostOptimal_Day2 {
	
	public void rotateMatrix(int [][] mat) {
		int row = mat.length;
		int col = mat[0].length;
		
		for(int i=0; i<row; i++) {
			for(int j=i; j<col; j++) {
				int temp = mat[i][j];
				mat[i][j] = mat[j][i];
				mat[j][i] = temp;
			}
		}
		for(int i=0; i<row; i++) {
			for(int j=0; j<col/2; j++) {
				int temp = mat[i][j];
				mat[i][j] = mat[i][row-j-1];
				mat[i][row-j-1] = temp;
			}
		}
	}
	
	public void display(int [][] mat) {
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[0].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		 
		Q6_Method2_MostOptimal_Day2 ob = new Q6_Method2_MostOptimal_Day2();
		/*int [][] mat = new int [][] {{1,2,3},
		                                          {4,5,6},
		                                          {7,8,9}};*/
		
		 int mat [][] = new int [][] {{5,1,9,11}, 
		                                          {2,4,8,10}, 
		                                          {13,3,6,7}, 
		                                          {15,14,12,16}};                                          
		ob.rotateMatrix(mat);
		ob.display(mat);

	}

}
