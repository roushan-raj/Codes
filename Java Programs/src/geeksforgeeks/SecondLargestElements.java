package geeksforgeeks;

import java.util.Scanner;

public class SecondLargestElements {

	public static void main(String[] args) {
		 
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
		
		int temp=0;
		int secLargest=0;
		for(int k=0; k<s; k++) {
			if(a[k]>a[secLargest]) {
				temp = a[secLargest];
				secLargest++;
			}
		}
		System.out.println("Second Largest Element is: "+temp);
		
	 
	  }
		
		
	}
		
}
