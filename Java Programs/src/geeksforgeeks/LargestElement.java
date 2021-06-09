package geeksforgeeks;

import java.util.Scanner;

public class LargestElement {
	
	public static void main(String [] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of test Cases");
		int t=sc.nextInt();
		
		for(int i=0; i<t; i++) {
		  System.out.println("Enter size of Array");
		  int s=sc.nextInt();
		  int a[] = new int [s];
		
		System.out.println("Enter elements of Array");
		for(int j=0; j<s; j++) {
			a[j] = sc.nextInt();
		}
		for(int m=0;m<s-1;m++) {
			int min=i;
			for(int n=m+1;n<s;n++) {
				if(a[n]<a[min]) {
					min=n;				
			}
		}
		int temp = a[i];
		a[i] = a[min];
		a[min] = temp;	
	}
		System.out.println("largest number is: "+a[s-1]);
  }	
	
  }
}
