package geeksforgeeks;

import java.util.Scanner;

public class TransposeOfArraay {

	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of test cases");
		int t = sc.nextInt();
		
		for(int p=0;p<t;p++) {
			System.out.println("Enter size of array");
			int n=sc.nextInt();
			int a[][]=new int[n][n];
			int b[][]=new int[n][n];
			
			System.out.println("Enter the element of Array");
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					a[i][j] = sc.nextInt();
				}
			}
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					b[j][i] = a[i][j];
				}
			}
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(b[i][j]+" ");
				}
			}
		}

	}

}
