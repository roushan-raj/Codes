
public class Q1_Method3_MostOptimal_Day2 {
	
	public void setZeros(int [][] mat) {
		int n = mat.length; int m = mat[0].length;
		int col0 = 1;
		for(int i=0; i<n; i++) {
			if (mat[i][0] == 0)
				col0 = 0;
			for(int j=1; j<m; j++) {
				if (mat[i][j] == 0) 
					mat[i][0] = mat [0][j] = 0;			
			}
		}
		for(int i=n-1; i>=0; i--) {
			for (int j=m-1; j>=1; j--) {
				if(mat[i][0] == 0 || mat[0][j] == 0)
					mat[i][j] = 0;
				if (col0 == 0)
					mat[i][0] = 0;
			}
		}
	}
	
	public void display (int [][] mat) {

		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[0].length; j++) {
				 System.out.print(mat[i][j] + " ");   
				}
			System.out.println();
			}
	}

	public static void main(String[] args) {
		 
		Q1_Method3_MostOptimal_Day2 ob = new Q1_Method3_MostOptimal_Day2();
		int [][] mat = new int [][] {{1,1,1,1},
									            {1,0,1,1,},
									            {1,1,0,1,},
									            {0,0,0,1}};
		ob.setZeros(mat);		
		ob.display(mat);

	}

}
