package geeksforgeeks;

import java.util.Arrays;
import java.util.Scanner;

public class PrintLeftElement {

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
			
			Arrays.sort(a);
					
			if(n%2 == 0) {
				System.out.println(a[n/2-1]);
				
			} else {
				System.out.println(a[n/2]);
				
			}
			
		}

	}

}
