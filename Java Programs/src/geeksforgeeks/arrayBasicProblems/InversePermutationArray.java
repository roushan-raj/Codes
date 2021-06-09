package geeksforgeeks.arrayBasicProblems;

import java.util.Scanner;

public class InversePermutationArray {

	public static void main(String[] args) {
 
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the no of test cases");
		int t = sc.nextInt();
		
		for(int i=0;i<t;i++) {
			System.out.println("Enter size of array");
			int n=sc.nextInt();
			int a[]=new int[n+1];
			int b[]=new int[n+1];
			
			System.out.println("Enter elements of array");
			for(int j=0;j<n;j++) {
				a[j]=sc.nextInt();
			}
			
			for(int j=0;j<n;j++) {
			   int temp = a[j];
			   b[temp] = j;
			   //System.out.print(a[temp]+" ");
			}
			for(int j=0;j<n;j++) {
			    System.out.println(b[j]+" ");
			}	
			

	}
		
  }

}
