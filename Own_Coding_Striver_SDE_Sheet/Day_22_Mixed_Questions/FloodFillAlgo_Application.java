
public class FloodFillAlgo_Application {
	
	// Question --> 
	// Given a matrix of ‘O’ and ‘X’, replace ‘O’ with ‘X’ if surrounded by ‘X’
	
	static void fill(int n, int m, char a[][]){
		
		// Step-1 --> Replace 'O' with '-'
		
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                if(a[i][j] == 'O')
                    a[i][j] = '-';
            }
        }
        
        // Step-2 --> Replace all left boundary '-' with 'O'
        
        for(int i=0; i<a.length; i++){
            if(a[i][0] == '-'){
                floodFillAlgo(a, i, 0, '-', 'O');
            }
        }
        
        // Step-2 --> Replace all right boundary '-' with 'O'
        
        for(int i=0; i<a.length; i++){
            if(a[i][a[0].length - 1] == '-'){
                floodFillAlgo(a, i, a[0].length - 1, '-', 'O');
            }
        }
        
        // Step-2 --> Replace all top boundary '-' with 'O'
        
        for(int i=0; i<a[0].length; i++){
            if(a[0][i] == '-'){
                floodFillAlgo(a, 0, i, '-', 'O');
            }
        }
        
        // Step-2 --> Replace all bottom boundary '-' with 'O'
        
        for(int i=0; i<a[0].length; i++){
            if(a[a.length - 1][i] == '-'){
                floodFillAlgo(a, a.length - 1, i, '-', 'O');
            }
        }
        
        // Step-3 --> Replace all internal remaining '-' with 'X'
        
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                if(a[i][j] == '-'){
                    a[i][j] = 'X';
                }
            }
        }
        
        // Printing Final Output Matrix
        
        for(int i=0; i<a.length; i++) {
        	for(int j=0; j<a[0].length; j++) {
        		System.out.print(a[i][j]+" ");
        	}
        	System.out.println();
        }
    }
    
    public static void floodFillAlgo(char[][] a, int i, int j, char old, char newC){
        if(i<0 || i>= a.length || j<0 || j>= a[0].length){
            return;
        }
        if(a[i][j] != old){
            return;
        }
        
        a[i][j] = newC;
        
        floodFillAlgo(a, i+1, j, old, newC); // Bottom
        floodFillAlgo(a, i-1, j, old, newC); // Top
        floodFillAlgo(a, i, j+1, old, newC); // Right
        floodFillAlgo(a, i, j-1, old, newC); // Left
        
    }

	public static void main(String[] args) {
		char[][] mat = {{'X', 'O', 'X', 'O', 'X', 'X'},
				        {'X', 'O', 'X', 'X', 'O', 'X'},
				        {'X', 'X', 'X', 'O', 'X', 'X'},
				        {'O', 'X', 'X', 'X', 'X', 'X'},
				        {'X', 'X', 'X', 'O', 'X', 'O'},
				        {'O', 'O', 'X', 'O', 'O', 'O'}};
		fill(mat.length, mat[0].length, mat);
	}
}
