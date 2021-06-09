
public class Q1_Method3_MostOptimal_Day3 {
	
	public boolean searchTarget(int[][]mat, int target) {
		int n = mat.length;
		int i = 0;
		int j = mat[0].length-1;
		
		while(i<n && j>=0) {
			if(mat[i][j] == target) {
				System.out.println("Element is present at : "+"["+ i + "," + j+"]");
				return true;
			}
			if(mat[i][j] < target)
				i++;
			else
				j--;
		}
		return false;
	}

	public static void main(String[] args) {
		 
		Q1_Method3_MostOptimal_Day3 ob = new Q1_Method3_MostOptimal_Day3();
		int [][] mat = new int [][] {{1,3,5,7},
									 {10,11,16,20},
									 {23,30,34,50}};
		System.out.print(ob.searchTarget(mat, 50));							    

	}

}
