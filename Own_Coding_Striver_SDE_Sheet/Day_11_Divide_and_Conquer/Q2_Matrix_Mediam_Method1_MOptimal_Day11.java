
import java.util.*;
public class Q2_Matrix_Mediam_Method1_MOptimal_Day11 {
	
	public int matrixMedian(int mat [][]) {
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		
		int row = mat.length;
		int col = mat[0].length;
		for(int i=0; i<row; i++) {
			min = Math.min(min, mat[i][0]);
			max = Math.max(max, mat[i][col-1]);
		}
		
		int medianIndex = (row * col + 1)/2;
		
		while(min<max) {
			int mid = min + (max-min)/2;
			int place =0;
			int get=0;
			
			for(int i=0; i<row; i++) {
				get = Arrays.binarySearch(mat[i],mid); 
				 if(get < 0) 
	                    get = Math.abs(get) - 1; 
				 else
	                { 
	                    while(get < mat[i].length && mat[i][get] == mid) 
	                        get += 1; 
	                }   
	                place = place + get; 
			}
			if(place < medianIndex)
				min = mid+1;
			else
				max = mid;
		}
		return min;
	}

	public static void main(String[] args) {
		Q2_Matrix_Mediam_Method1_MOptimal_Day11 ob = new Q2_Matrix_Mediam_Method1_MOptimal_Day11();
		int mat [][] = new int [][] {{3,4,5},
			                         {2,9,10},
			                         {4,10,13},
			                         {5,6,7},
			                         {1,12,19}};
		
//		int mat [][] = new int [][] {{1,3,5},
//                                   {2,6,9},
//                                   {3,6,9}};

		System.out.println(ob.matrixMedian(mat));	                         
	}
}
