package geeksforgeeks;

import java.util.Scanner;

public class ValueofSameIndex {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the no of test cases");
		int t = sc.nextInt();
		
		for(int i=0;i<t;i++) {
			System.out.println("Enter size of array");
			int n=sc.nextInt();
			int a[]=new int[n+1];
			
			System.out.println("Enter elements of array");
			for(int j=1;j<=n;j++) {
				a[j]=sc.nextInt();
			}
			int flag = 0;
			for(int j=1;j<=n;j++) {
				if(a[j] == j) {
					flag = 1;
					System.out.print(a[j]+" ");
				}
			}
			if(flag == 0) {
				System.out.println("Not Found");
				System.out.println();
			}
			
			
	  }
		
  }

}
