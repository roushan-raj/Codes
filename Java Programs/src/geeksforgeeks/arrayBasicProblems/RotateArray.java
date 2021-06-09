package geeksforgeeks.arrayBasicProblems;

import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the no of test cases");
		int t = sc.nextInt();
		
		for(int i=1;i<=t;i++) {
			System.out.println("Enter size of array");
			int n=sc.nextInt();
			int a[]=new int[n+1];
			
			System.out.println("Enter elements of array");
			for(int j=1;j<=n;j++) {
				a[j]=sc.nextInt();
			}
			System.out.println("Enter that rotating Number");
			int r = sc.nextInt();
			
			for(int j=r+1;j<=n;j++) {
			    System.out.println(a[j] + " ");
			}
			for(int j=1; j<=r;j++) {
				System.out.println(a[j] + " ");
			}
			System.out.println();
			
//			for(int j=1;j<=n;j++) {
//				System.out.println(b[j]);
//			}

	}
	
  }		

}
