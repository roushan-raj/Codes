package geeksforgeeks;

import java.util.Scanner;

public class MultiplyArrayElements {

	public static void main(String[] args) {
 
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the no of test cases");
		int t = sc.nextInt();
		
		for(int i=0;i<t;i++) {
			System.out.println("Enter size of array");
			int n=sc.nextInt();
			int a[]=new int[n];
			
			System.out.println("Enter elements of array");
			int mul=1;
			for(int j=0;j<n;j++) {
				a[j]=sc.nextInt();
				mul = mul * a[j];
			}
			System.out.println(mul);
			
	}

	}

}
