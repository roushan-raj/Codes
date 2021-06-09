
public class Q6_Method2_MostOptimal_Day22 {
	
	public void dfs(int[][] image, int sr, int sc, int newColor, int rows, int cols, int source) {
        
		if(sr < 0 || sr >= rows || sc < 0 || sc >= cols)
			return;
		
		else if(image[sr][sc] != source)
			return;
		
		image[sr][sc] = newColor;
		
		dfs(image, sr-1, sc, newColor, rows, cols, source);  // Top
		dfs(image, sr+1, sc, newColor, rows, cols, source);  // Down
		dfs(image, sr, sc-1, newColor, rows, cols, source);  // Left
		dfs(image, sr, sc+1, newColor, rows, cols, source);  // Right
	}
	
	public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
		
		if(image[sr][sc] == newColor)
			return image;
		
		int rows = image.length;
		int cols = image[0].length;
		int source = image[sr][sc];
		
		dfs(image, sr, sc, newColor, rows, cols, source);
		
		return image;
	}

	public static void main(String[] args) {
		Q6_Method2_MostOptimal_Day22 ob = new Q6_Method2_MostOptimal_Day22();
		
		int [][] image = new int[][] {{1,1,1},
		                              {1,1,0},
		                              {1,0,1}};
		int sr = 0;
		int sc = 0;
		int newColor = 2;
		
		int [][] newImage = ob.floodFill(image, sr, sc, newColor);
		
		for(int i=0; i<newImage.length; i++) {
			for(int j=0; j<newImage[0].length; j++) {
				System.out.print(newImage[i][j] + " ");
			}
			System.out.println();
		}
	}
}
