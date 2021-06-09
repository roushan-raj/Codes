package geeksforgeeks;

import java.util.Arrays;
import java.util.Scanner;

public class IfArrayIsSorted {

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
			
	        int flag=0;
	        for(int j=0;j<n-1;j++) {
	        	if(a[j] > a[j+1]) {
	        	   flag = 1;
	        	   break;
	            }
	        }	
	        if(flag == 0) {
	        	System.out.println("1");
	        }
	        else {
	        	System.out.println("0");
	        }
	        	
	        	

	}
		
  }

}
