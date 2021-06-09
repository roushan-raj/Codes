package geeksforgeeks.arrayBasicProblems;

import java.util.Scanner;

public class SumOfIndex {

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
			int sum=0;
			for(int p=0;p<n-1;p++){
			    for(int q=p+1;q<n;q++){
			       if(Math.abs(a[q]-a[p])>1){
			           sum=sum+a[q]-a[p];
			       }
			       if(Math.abs(a[q]-a[p])<=1){
			           sum=sum+0;
			       }
			    }
			}
			System.out.print(sum);
			
	}

	}

}
