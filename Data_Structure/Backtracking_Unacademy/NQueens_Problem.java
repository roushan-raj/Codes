
public class NQueens_Problem {
	                                // Find all possible arrangements of N Queen and also print it // 
	int count = 0;
	public boolean boundaryCondition(boolean [][] grid, int row, int col, int n) {
		
		// all upper columns checks
		for(int i=row-1; i>=0; i--) {
			if(grid[i][col]==true)
				return false;
		}
		// all left upper diagonal checks
		for(int i=row-1, j = col-1; i>=0 && j>=0; i--, j--) {
			if(grid[i][j]==true) 
				return false;
		}
		// all right upper diagonal checks
		for(int i=row-1, j=col+1; i>=0 && j<n; i--, j++) {
			if(grid[i][j]==true)
				return false;
		}
		return true;
	}
	
	public void display(boolean[][] grid, int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(grid[i][j])
					System.out.print("Q ");
				else
					System.out.print(". ");
			}
			System.out.println();
		}
	}
	
	public int countNQueensArrangement(boolean[][]grid, int curr_row, int n) {
		// Base case
		if(curr_row == n) {
			count++;
			display(grid, n);
			System.out.println();
			System.out.println();
			return 0;
		}
		for(int i=0; i<n; i++) {
			if(boundaryCondition(grid, curr_row, i, n)) {
				grid[curr_row][i] = true;
				countNQueensArrangement(grid, curr_row+1, n);
				grid[curr_row][i] = false;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		NQueens_Problem ob = new NQueens_Problem();
		int n = 4;                                    // you can try for any value of n
		boolean[][]grid = new boolean[n][n];
		System.out.println("No.of possible arrangements: "+ob.countNQueensArrangement(grid, 0, n));
	}
}
