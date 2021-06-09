package geeksforgeeks;

import java.util.Scanner;

public class GameWithNos {

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
			for(int i=0;i<n-1;i++) {
				b[i] = a[i] ^ a[i+1];
			}
			b[n-1] = a[n-1];
			
			for (int i=0;i<n-1;i++) {
				System.out.print(b[i]+" ");
			}
			System.out.print(b[n-1]);
		
	}
		
  }

}
