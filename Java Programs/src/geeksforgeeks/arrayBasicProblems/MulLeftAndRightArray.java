package geeksforgeeks.arrayBasicProblems;

import java.util.Scanner;

public class MulLeftAndRightArray {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the no of test cases");
		int t = sc.nextInt();
		
		for(int i=0;i<t;i++) {
			System.out.println("Enter size of array");
			int n=sc.nextInt();
			int a[]=new int[n];
			
			System.out.println("Enter elements of array");
			for(int j=0;j<n;j++) {
				a[j]=sc.nextInt();
			}
			int sum1=0,sum2=0,sum3=0;
			for(int j=0;j<n/2;j++) {
				sum1 = sum1 + a[j]; 
			}
			
			for(int j=n/2;j<n;j++) {
				sum2 = sum2 + a[j];
			}
			sum3 = sum1*sum2;
			System.out.println(sum3);
			
	}	
		System.out.println();

  }

}
