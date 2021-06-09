package geeksforgeeks;

import java.util.Scanner;

public class SwapOfKthElement {

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
			
			System.out.println("Enter Kth element for Swapping");
			int k = sc.nextInt();
			if(k < n) {
				int temp = a[k-1];
				a[k-1] = a[n-k];
				a[n-k] = temp;
			}
			for(int j=0;j<n;j++) {
				System.out.print(" "+a[j]);
			}
			
		}

	}

}
