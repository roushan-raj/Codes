
public class Rat_on_Maze_in_Two_Directions {
	
	// When rat is allowed to move in "right" and "down" directions only
	
	int count = 0;
	public int allPossiblePaths(int i, int j, int n, int m, String path) {
		
		// base case
		if(i == n-1 && j == m-1) {
			count++;
			System.out.println(path);
			return 0;
		}
		
		// boundary condition checks
		if(i>=n || j>=m) {
			return 0;
		}
		
		// Recursive calls
		allPossiblePaths(i+1, j, n, m, path+"D "); // Down move
		allPossiblePaths(i, j+1, n, m, path+"R "); // Right move
		
		return count;
	}

	public static void main(String[] args) {
		Rat_on_Maze_in_Two_Directions ob = new Rat_on_Maze_in_Two_Directions();
		System.out.println("Total path combinations: "+ob.allPossiblePaths(0, 0, 4, 4,""));
	}
}
