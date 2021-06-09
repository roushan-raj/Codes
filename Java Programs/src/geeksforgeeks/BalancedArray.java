package geeksforgeeks;

import java.util.Scanner;

public class BalancedArray {

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
			int sum=0,sum1=0,res;
			for(int j=0;j<n/2;j++) {
				sum = sum + a[j]; 
			}
			
			for(int j=n/2;j<n;j++) {
				sum1 = sum1 + a[j];
			}
			if(sum==sum1) {
				res=0;
			}
			else {
				res=Math.abs(sum-sum1);
			}
			System.out.println(res);

	}	
	
  }

}
