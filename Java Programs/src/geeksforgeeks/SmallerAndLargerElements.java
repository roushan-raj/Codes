package geeksforgeeks;

import java.util.Scanner;

public class SmallerAndLargerElements {

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
			System.out.println("Enter that Number");
			int m = sc.nextInt();
			
			int count1=0;
			int count2=0;
			for(int j=0;j<n;j++) {
				if (a[j] <= m)
					count1++;
			}
			for(int j=0;j<n;j++)  {
				if (a[j] >= m)
					count2++;
			} 
			System.out.println(count1+" "+count2);
	
	}
		
  }

}
