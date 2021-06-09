package geeksforgeeks;

import java.util.Scanner;

public class CompeteSkills {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the no of test cases");
		int t = sc.nextInt();
		
		for(int i=0;i<t;i++) {
			System.out.println("Enter size of A's and B's Array");
			int n=sc.nextInt();
			int a[]=new int[n];
		    int b[]=new int[n];
			
			System.out.println("Enter elements of A's array");
			for(int j=0;j<n;j++) {
				a[j]=sc.nextInt();
			}
			
			System.out.println("Enter elements of B's array");
			for(int k=0;k<n;k++) {
				b[k]=sc.nextInt();
			}
			
			int count1=0, count2=0;
			for(int p=0;p<n;p++) {
				if(a[p] > b[p]) {
					count1++;
				}
				if(a[p] < b[p]) {
					count2++;
				}
			}
			System.out.println(count1+" "+count2);
			

	}
		
  }

}
