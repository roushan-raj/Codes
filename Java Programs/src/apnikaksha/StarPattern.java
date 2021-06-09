package apnikaksha;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the no of rows and column");
		int n = sc.nextInt();
		
		//System.out.println("Enter the no of column");
		//int m = sc.nextInt();
		
		for(int i=1; i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		//System.out.println();
	}

}
