import java.util.Arrays;

public class Q22_Sort_the_Given_Matrix_Row_Wise {
	
	public static void sortMatrixRowWise(int [][] arr, int m, int n) {
		for(int i=0; i<m; i++) {
			Arrays.sort(arr[i]);
		}
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		int [][] arr = {{7, 9, 2, 4},
				        {3, 2, 5, 4},
				        {9, 7, 8, 1}};
		
		sortMatrixRowWise(arr, arr.length, arr[0].length);
		
	}
}
