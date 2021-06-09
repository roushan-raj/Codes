package apnikaksha;

import java.util.Scanner;

public class StarPattern2 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the no of rows and column");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i-1;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=(n-i+1);j++) {
				System.out.print("* ");
		  }
			System.out.println();
		}

	}

}
