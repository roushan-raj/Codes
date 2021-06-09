package geeksforgeeks.arrayBasicProblems;

import java.util.Scanner;

public class CountPairsXorOdd {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the no of test cases");
		int t = sc.nextInt();
		
		for(int p=0;p<t;p++) {
			System.out.println("Enter size of array");
			int n=sc.nextInt();
			int a[]=new int[n];
			int b[]=new int[n];
			
			System.out.println("Enter elements of array");
			for(int j=0;j<n;j++) {
				a[j]=sc.nextInt();
			}
			int count=0;
			for(int i=0;i<n-1;++i) {
				for(int j=i+1;j<n;j++) {
				   if((a[i]^a[j])%2 != 0) {
					   count++;
				   }
				
				}
	        }
			System.out.println(count);
			
		}
		
		
	}
	
	
}
