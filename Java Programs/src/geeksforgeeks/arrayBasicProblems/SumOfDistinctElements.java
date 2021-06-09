package geeksforgeeks.arrayBasicProblems;

import java.util.Scanner;

public class SumOfDistinctElements {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the no of test cases");
		int t = sc.nextInt();
		
		for(int p=0;p<t;p++) {
			System.out.println("Enter size of array");
			int n=sc.nextInt();
			int a[]=new int[n];
			
			System.out.println("Enter elements of array");
			for(int j=0;j<n;j++) {
				a[j]=sc.nextInt();
			}
			int sum=0;
			for(int i=0;i<n-1;i++) {
				if(a[i]!=a[i+1]) {
					sum = sum+a[i];
				}
			}
			if(a[n-1]!=a[n-2]) {
				sum = sum + a[n-1];
			} else {
				sum = sum + a[n-2];
			}
			
			System.out.println(sum);

	}
		
  }

}
