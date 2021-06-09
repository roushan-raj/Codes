package geeksforgeeks;

import java.util.Scanner;

public class MaxMinOfArray {

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
			int largest=0,max=0;
			for(int j=0;j<n;j++) {
				if(a[j] > a[max]) {
					max = j;
					largest = a[j];	
				}
			}
			System.out.println(largest);
			
			int smallest=0,min=0;
			for(int j=0;j<n;j++) {
				if(a[j] < a[min]) {
					min = j;
					smallest = a[j];	
				}
			}
			System.out.println(smallest);

	}

	}

}
