package apnikaksha;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the rows and column of Matrix");
		int n = sc.nextInt();
		int a[][] = new int [n][n];
		int b[][] = new int [n][n];
		int c[][] = new int [n][n];
		
		System.out.println("Enter the elements of 1st matrix");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j] = sc.nextInt();	
			}
		}
		System.out.println("Entered 1st matrix is: ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}
		//System.out.println("Entered Matrix is: "+a[i][j]);
		
		System.out.println("Enter the elements of 2nd matrix");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				b[i][j] = sc.nextInt();	
			}
		}
		System.out.println("Entered 2nd Matrix is: ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(b[i][j] +" ");
			}
			System.out.println();
		}
		//System.out.println("Entered Matrix is: "+b[i][j]);
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				c[i][j] = a[i][j]+b[i][j];
			}
		}		
		System.out.println("Result Matric c is: ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(c[i][j] +" ");
			}
			System.out.println();
		}		
			
	}

}
