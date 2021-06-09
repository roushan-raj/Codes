
public class NKnights_Problem {
	
	public boolean boundaryConditions(int row, int col, boolean[][] grid, int n) {
		// check for right upper diagonal up
		if(row-2>=0 && col+1<n && grid[row-2][col+1])
			return false;
		// check for right upper diagonal right
		if(row-1>=0 && col+2<n && grid[row-1][col+2])
			return false;
		// check for left upper diagonal up
		if(row-2>=0 && col-1>=0 && grid[row-2][col-1])
			return false;
		// check for left upper diagonal left
		if(row-1>=0 && col-2>=0 && grid[row-1][col-2])
			return false;
		return true;
	}
	
	public void display(boolean[][] grid, int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(grid[i][j]) {
					System.out.print("K ");
				} else {
					System.out.print(". ");
				}
			}
			System.out.println();
		}
	}
	
	int arrangements = 0;
	public void nKnightsArrangements(int n, boolean[][] grid, int curr_row, int curr_col, int knight_count) {
		if (knight_count == n) {
			arrangements++;
			display(grid, n);
			System.out.println();
			return;
		}
		for(int i=curr_row; i<n; i++) {
			for(int j=(i == curr_row)?curr_col:0 ; j<n; j++) {   // dry run for n=2 to understand line 42
				if(boundaryConditions(i, j, grid, n)) {
					grid[i][j] = true;
					nKnightsArrangements(n, grid, i, j+1, knight_count+1);
					grid[i][j] = false;                          // imp step in Backtracking
				}
			}
		}
	}

	public static void main(String[] args) {
		NKnights_Problem ob = new NKnights_Problem();
		int n = 5; // knights value and size of grid
		boolean [][] grid = new boolean[n][n];
		ob.nKnightsArrangements(n, grid, 0, 0, 0);
		System.out.println("Total arrangements: "+ob.arrangements);
	}
}
