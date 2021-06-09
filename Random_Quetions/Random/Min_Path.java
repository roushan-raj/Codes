
public class Min_Path {
	
	int distance = Integer.MAX_VALUE;
	public int findTreasure(int [][] area) {
		if(area == null) {
			return -1;
		}
		int curr_dis = 0;
		boolean [][] visited = new boolean [area.length][area[0].length];
		dfs(area, 0, 0, visited, curr_dis);
		return distance;
	}
	public void dfs(int [][] area, int i, int j, boolean[][] visited, int curr_dis) {
		if(i<0 || i>=area.length || j<0 || j>=area[0].length || area[i][j] == 0 || visited[i][j] == true) {
			return;
		}
		if(area[i][j] == 9) {
			distance = Math.min(distance, curr_dis);
			return;
		}
		visited[i][j] = true;
		dfs(area, i-1, j, visited, curr_dis+1); // top
		dfs(area, i+1, j, visited, curr_dis+1); // down
		dfs(area, i, j-1, visited, curr_dis+1); // left
		dfs(area, i, j+1, visited, curr_dis+1); // right
		visited[i][j] = false;
	}

	public static void main(String[] args) {
		Min_Path ob = new Min_Path();
		int [][] area = new int [][] {{1, 0, 0},
			                          {1, 0, 0},
			                          {1, 9, 1}};
	    System.out.println(ob.findTreasure(area));
	}
}
