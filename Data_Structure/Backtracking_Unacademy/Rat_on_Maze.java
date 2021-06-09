
public class Rat_on_Maze {	
	// Rat have to reach from (0,0) to (n-1,m-1) in grid where cheese is kept and "1" in grid means blocked path.
	// Rat can move in all 4 directions, find No.of all possible paths to reach at cheese 
	int totalPaths = 0;
	
	// to check boundary condition....
	public boolean boundaryCondition(int [][] grid, int i, int j, int n, int [][] visited) {
		return i < n && j < n && i >=0 && j >= 0 && grid[i][j]==0 && visited [i][j] == 0; 
	}
	
	// rat moves....
	public void ratMoves(int i, int j, int n, int [][] grid, int [][] visited) {
		// base case
		if(i == n-1 && j == n-1) {
			totalPaths++;
			return;
		}
		if(! boundaryCondition(grid, i, j, n, visited)) {
			return;
		}
		
		visited[i][j] = 1;
		
		// all 4 moves
		if(i+1<n && grid[i+1][j] == 0) {         // down move
			ratMoves(i+1, j, n, grid, visited);
		}
		if(i-1>=0 && grid[i-1][j] == 0) {        // up move
			ratMoves(i-1, j, n, grid, visited);
		}
		if(j+1<n && grid[i][j+1] == 0) {         // right move
			ratMoves(i, j+1, n, grid, visited);
		}
		if(j-1>=0 && grid[j-1][j] == 0) {        // left move
			ratMoves(i, j-1, n, grid, visited);
		}
		
		visited[i][j] = 0;   // main step in backtracking
		return;
	}
	
	// total possible paths....
	public int allPossiblePaths(int [][] grid) {
		int n = grid.length;
		int[][] visited = new int [n][n];
		ratMoves(0, 0, n, grid, visited);
		return totalPaths;
	}
	
	public static void main(String[] args) {
		Rat_on_Maze ob = new Rat_on_Maze();
		
//		int [][] grid = {{0, 0, 1, 0, 0, 1, 0},
//			             {1, 0, 1, 1, 0, 0, 0},
//			             {0, 0, 0, 0, 1, 0, 1},
//			             {1, 0, 1, 0, 0, 0, 0},
//			             {1, 0, 1, 1, 0, 1, 0},
//			             {1, 0, 0, 0, 0, 1, 0},
//			             {1, 1, 1, 1, 0, 0, 0}}; 
		
		int [][] grid = {{0,0,0,0},
		                 {0,0,0,1},
		                 {0,1,0,1},
		                 {0,1,0,0}};
		
		System.out.println("Total possible paths can be: " + ob.allPossiblePaths(grid));
	}
}
