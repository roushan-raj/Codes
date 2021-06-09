import java.util.Scanner;

public class Q1_Day2_Method1 {
	
	public void setZeros(int [][] mat) {
		int n = mat.length; int m = mat[0].length;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(mat[i][j] == 0) {
					for (int k =0; k<m; k++) {
						if (mat[i][k] != 0) {
							mat[i][k] = -1;
						}
					}
					for (int k =0; k<n; k++) {
						if (mat[k][j] != 0) 
							mat[k][j] = -1;
						
					}
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(mat[i][j] == -1) 
					mat[i][j] = 0;
				
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
		 
		Q1_Day2_Method1 ob = new Q1_Day2_Method1();
		/*int [][] mat = new int [][] {{1,1,1,1},
			                                     {1,0,1,1,},
			                                     {1,1,0,1,},
			                                     {0,0,0,1}}; */
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of Rows : ");
		int row = sc.nextInt();
		
		System.out.print("Enter no of Columns : ");
		int col = sc.nextInt();
		
		int [] [] mat = new int [row][col];
		
		System.out.println("Enter elements of Matrix");
		for (int i=0; i<row; i++) {
			for (int j=0; j<col; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		sc.close();
		
		ob.setZeros(mat);	 
		System.out.println("Output is : ");
		ob.display(mat);
	    

	}

}
