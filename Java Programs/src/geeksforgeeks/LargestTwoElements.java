package geeksforgeeks;

import java.util.Scanner;

public class LargestTwoElements {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the no of test cases");
		int t = sc.nextInt();
		
		for(int k=0;k<t;k++) {
			System.out.println("Enter size of array");
			int n=sc.nextInt();
			int a[]=new int[n];
			
			System.out.println("Enter elements of array");
			for(int j=0;j<n;j++) {
				a[j]=sc.nextInt();
			}
			for(int i=0;i<n-i;i++) {
				int minIndex = i;
				for(int j=i;j<n;j++) {
					if(a[j] < a[minIndex]) {
						minIndex = j;
					}
				}
				int temp = a[i];
				a[i] = a[minIndex];
				a[minIndex] = temp;
				
			}
			for(int m=0;m<n-2;m++) {
				System.out.print(a[m] + " ");
			}
			
	}

 }

}	
	