import java.util.*;
public class Q6_Method1_MostOptimal_Day14 {
	
	class Pair {
		int x; 
		int y;
		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	public int rottenOrange(int [][] grid) {
		int r = grid.length;
		int c = grid[0].length;
		
		Queue<Pair> q = new LinkedList<>();
		int total = 0, rotten = 0, time = 0;
		
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				if(grid[i][j] == 1 || grid[i][j] == 2) 
					total++;
				if(grid[i][j] == 2) 
					q.offer(new Pair(i, j));
			}
		}
		
		if(total == 0) return 0;
		
		while(!q.isEmpty()) {
			int size = q.size();
			rotten = rotten + size;
			if(rotten == total) return time;
			
			time++;
			
			for(int i=0; i<size; i++) {
				Pair p = q.peek();
				
				// to check 'down orange'
				if(p.x + 1 < r && grid[p.x + 1][p.y] == 1) {
					grid[p.x + 1][p.y] = 2;
					q.offer(new Pair(p.x + 1, p.x));
				}
				// to check 'right orange'
				if(p.y + 1 < c && grid[p.x][p.y + 1] == 1) {
					grid[p.x][p.y + 1] = 2;
					q.offer(new Pair(p.x, p.y + 1));
				}
				// to check 'upper orange'
				if(p.x - 1 >= 0 && grid[p.x - 1][p.y] == 1) {
					grid[p.x - 1][p.y] = 2;
					q.offer(new Pair(p.x - 1, p.x));
				}
				// to check 'left orange'
				if(p.y - 1 >= 0  && grid[p.x][p.y - 1] == 1) {
					grid[p.x][p.y - 1] = 2;
					q.offer(new Pair(p.x, p.y - 1));
				}
				q.poll();
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Q6_Method1_MostOptimal_Day14 ob = new Q6_Method1_MostOptimal_Day14();
//		int [][] grid = new int [][] {{0,2,0,0,2},
//			                          {0,1,0,1,1},
//			                          {0,1,0,1,2},
//			                          {2,1,0,2,0}};
		
		int [][] grid = new int [][] {{2,1,1},
                                      {1,1,0},
                                      {0,1,1}};
                                      
	                          
    
		System.out.println(ob.rottenOrange(grid));	                          
	}
}
