
public class Q6a_Method1_MostOptimal_Day23 {
	
	public int countIslands(int[][] grid) {
		int count = 0;
		
		for(int i=0; i<grid.length; i++) {
			for(int j=0; j<grid[0].length; j++) {
				if(grid[i][j] == 1) {
					dfs(grid, i, j);
					count++;
				}
			}
		}
		return count;
	}
	
	public void dfs(int[][] grid, int i, int j) {
		if(i>=0 && j>=0 && i<grid.length && j<grid[0].length && grid[i][j] == 1) {
			grid[i][j] = 2;  // marking as visited
			dfs(grid, i-1, j); // top
			dfs(grid, i+1, j); // down
			dfs(grid, i, j-1); // left
			dfs(grid, i, j+1); // right
		}
	}

	public static void main(String[] args) {
		Q6a_Method1_MostOptimal_Day23 ob = new Q6a_Method1_MostOptimal_Day23();
		int grid [][] = new int[][] {{1,1,0,0,0},
		                             {1,1,0,0,0},
		                             {0,0,1,0,0},
		                             {0,0,0,0,0},
		                             {0,0,0,1,1}};
		                             
		System.out.println(ob.countIslands(grid));                             
	}
}
