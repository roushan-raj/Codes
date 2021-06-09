package geeksforgeeks.arrayBasicProblems;

import java.util.Scanner;

public class GreaterOnRigthSide {

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
			
			for(int i=0;i<n;i++) {
				if(i==n-1) {
					b[i] = -1;
					break;
				}
				int max = a[i+1];
				for(int j=i+1;j<n;j++) {
					if(a[j] > max) {
						max = a[j];
					}
				}
				b[i]=max;
			}
			for(int item : b) {
				System.out.print(item+" ");
			}
			System.out.println();

	}
		
  }

}
