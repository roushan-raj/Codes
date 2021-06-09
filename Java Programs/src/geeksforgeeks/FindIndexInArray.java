package geeksforgeeks;

import java.util.Scanner;

public class FindIndexInArray {

	public static void main(String[] args) {
		
		int j,k;
		 
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the no of test cases");
		int t = sc.nextInt();
		
		for(int i=0;i<t;i++) {
			System.out.println("Enter size of array");
			int n=sc.nextInt();
			int a[]=new int[n];
			
			System.out.println("Enter elements of array");
			for(int p=0;p<n;p++) {
				a[p]=sc.nextInt();
			}
			System.out.println("Enter that Element");
			int m = sc.nextInt();
			
			for(j=0;j<n;j++) {
				if(a[j] == m)
					break;
			}
			for(k=n-1;k>0;k--) {
				if(a[k] == m)
					break;
			}
			System.out.println(j+" "+k);

	}
		
  }

}
