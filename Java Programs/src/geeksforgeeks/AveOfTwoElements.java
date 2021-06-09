package geeksforgeeks;

import java.util.Scanner;

public class AveOfTwoElements {

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
			int avg=0,sum=0,count=1;
			for(int j=0;j<n;j++) {
				sum = (sum+a[j]);
				avg = sum/count;
				count++;
				System.out.print(" "+avg);
            }
			System.out.println();
			
		
    }
		
  }

}
