
class Q14_Find_Word_In_Grid {

	static boolean findmatch(char mat[][], String pat, int x, int y, int nrow, int ncol, int level) {
		int l = pat.length();
	
		if (level == l)
			return true;
	
		if (x < 0 || y < 0 || x >= nrow || y >= ncol)
			return false;
	
		if (mat[x][y] == pat.charAt(level)) {
	
			// Marking this cell as visited
		    char temp = mat[x][y];
			mat[x][y] = '#';
	
			// finding sub-pattern in 4 directions
			boolean res = findmatch(mat, pat, x - 1, y, nrow, ncol, level + 1) ||
						  findmatch(mat, pat, x + 1, y, nrow, ncol, level + 1) ||
						  findmatch(mat, pat, x, y - 1, nrow, ncol, level + 1) ||
						  findmatch(mat, pat, x, y + 1, nrow, ncol, level + 1);
	
			// marking this cell as unvisited again
			mat[x][y] = temp;
			return res;
		}
		else // Not matching then false
			return false;
	}

    //Function to check if the word exists in the grid or not
	static boolean checkMatch(char mat[][], String pat, int nrow, int ncol) {
	
		int l = pat.length();
		
		if (l > nrow * ncol)
			return false;
	
		for (int i = 0; i < nrow; i++){
			for (int j = 0; j < ncol; j++){
				if (mat[i][j] == pat.charAt(0))
					if (findmatch(mat, pat, i, j, nrow, ncol, 0))
						return true;
			}
		}
		return false;
	}


	public static void main(String[] args) {
		char grid[][] =   { "abco".toCharArray(),
							"delm".toCharArray(),
							"qwqe".toCharArray(),
							"xyzk".toCharArray() };
	
		if (checkMatch(grid, "welcome", 4, 4))
			System.out.print("welcome");
		else
			System.out.print("False");
	} 
}

