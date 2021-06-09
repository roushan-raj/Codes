package geeksforgeeks;

import java.util.Scanner;

public class CountSmallerElements {

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
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
			
			System.out.println("Enter your number");
		    int m=sc.nextInt();
		    
		    int count=0; 
			for(int j=0;j<n;j++) {  
			       if(a[j] <= m) {
				       count++; 
			       }     
			}	
			System.out.println(count);
		}
	}
}
