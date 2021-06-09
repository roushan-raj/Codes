package geeksforgeeks.arrayBasicProblems;

import java.util.Scanner;
import java.util.Arrays;

public class MaxValueAfterMRangeOperation {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner (System.in);
		//System.out.println("Enter the no of test cases");
		int t = sc.nextInt();              // Enter no of test cases
		
		for(int i=0;i<t;i++) {
			//System.out.println("Enter size of array");
			int N=sc.nextInt();            // Enter size of array
			int n[]=new int[N];
			
			int M=sc.nextInt();            // Enter the value of M
			for(int j=0;j<M;j++) {
				int a = sc.nextInt();      // Enter the value of a
				int b = sc.nextInt();      // Enter the value of b
				int k = sc.nextInt();      // Enter the value of k
			    for(int q=a; q<=b; q++) {
			    	n[q]+=k;
			    }
			}
			Arrays.sort(n);
			System.out.println(n[N-1]);
			
	    }

  }
	
}
