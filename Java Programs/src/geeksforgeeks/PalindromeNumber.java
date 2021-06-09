package geeksforgeeks;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the no of test cases");
		int t = sc.nextInt();
		
		for(int i=0;i<t;i++) {
			System.out.println("Enter size of array");
			int n=sc.nextInt();
			int a[]=new int[n];
			int b[]=new int[n];
			
			System.out.println("Enter elements of array");
			for(int j=0;j<n;j++) {
				a[j]=sc.nextInt();
			}
			
			int temp = 0;
			for(int j=n-1;j>=0;j--) {
				b[temp] = a[j];
				temp++;
			}
			    int count = 0;
                for(int j=0;j<n;j++) {
				   if(b[j] == a[j]) {
					  count = 1;	
				  }
				   else {
					   count = 0;
					   break;
				   }
			  }
                if(count == 1) {
                    System.out.println("PERFECT");
                }
                if(count == 0) {
                	System.out.println("NOT PERFECT");
                }
                System.out.println();

	}
		
  }

}
