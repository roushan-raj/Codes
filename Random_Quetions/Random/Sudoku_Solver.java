
public class Sudoku_Solver {
	
	// we know that we can have 3 storage pace 1-row, 1-col, 1-box
	int row [][] = new int [9][10];
	int col [][] = new int [9][10];
	int box [][] = new int [9][10];
	
	// this board contains the pre-assigned digits of the given Sudoku
	// here Zero means blank space
	int board [][] = new int[][]   {{5,3,0,0,7,0,0,0,0},
							        {6,0,0,1,9,5,0,0,0},
							        {0,9,8,0,0,0,0,6,0},
							        {8,0,0,0,6,0,0,0,3},
							        {4,0,0,8,0,3,0,0,1},
							        {7,0,0,0,2,0,0,0,6},
							        {0,6,0,0,0,0,2,8,0},
							        {0,0,0,4,1,9,0,0,5},
							        {0,0,0,0,8,0,0,7,9}};
							        
	public void addOriginalDigits() {
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				if(board[i][j] != 0) {
					int x = board[i][j];
					addDigit(x,i,j);
				}
			}
		}
	}						        
							        
	boolean isSudukoSolved = false;
	
	public boolean canPlace(int d, int r, int c) {
		// can we place the digit d in rth row and cth column
		// we need to calculate i -> i is the box number of all 9 (3*3 boxes).
		
	    int i = (r/3)*3 + (c/3);  // 3R+C
		return row[r][d] + col[c][d] + box[i][d] == 0;
	}
	
	public void addDigit(int d, int r, int c) {     
		int i = (r/3)*3 + (c/3); 
		row[r][d]++;
		col[c][d]++;
		box[i][d]++;
		board[r][c] = d;	
	}
	
	public void removeDigit(int d, int r, int c) {  // Backtracking
		int i = (r/3)*3 + (c/3);  // 3R+C
		row[r][d]--;
		col[c][d]--;
		box[i][d]--;
		board[r][c] = 0;	
	}
	
	public void display() {
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void nextPlacement(int r, int c) {
		if(r == 8 && c == 8) {
			isSudukoSolved = true;
			// Print Sudoku 
			System.out.println("Valid Sudoku is: "+"\n");
			display();
		}
		else {
			if(c == 8) 
				helper(r+1, 0);
			else
				helper (r, c+1);
		}
	}
	
	public void helper(int r, int c) {
		if(board[r][c] == 0) {
			for(int d=1; d<=9; d++) {
				if(canPlace(d,r,c)) {
					addDigit(d,r,c);
					nextPlacement(r,c);
					if(!isSudukoSolved)
						removeDigit(d,r,c);
				}
			}
		}
		else {
			nextPlacement(r,c);
		}
	}
	
	public void solveSudoku() {
		helper(0,0);
	}

	public static void main(String[] args) {
		Sudoku_Solver ob = new Sudoku_Solver();
		ob.addOriginalDigits();
		ob.solveSudoku();	
	}
}





