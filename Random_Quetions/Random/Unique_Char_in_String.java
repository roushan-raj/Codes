import java.util.Scanner;

public class Unique_Char_in_String {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // row
		int m = sc.nextInt(); // column
	
		int [][] arr = new int [n][m];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int j=0; j<m; j++) {
			int value=Integer.MAX_VALUE;
			for(int i=0; i<n; i++) {
			    value = Math.min(arr[i][j], value);
			}
			System.out.print(value+" ");
		}	
		sc.close();
	}
}
