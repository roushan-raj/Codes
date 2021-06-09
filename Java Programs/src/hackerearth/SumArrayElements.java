package hackerearth;

import java.util.Scanner;

public class SumArrayElements {

	public static void main(String[] args) {
		
		 
		 Scanner sc = new Scanner(System.in);
				 System.out.println("Enter the no of test cases");
				 int t = sc.nextInt();
				 
				 for(int i=0; i<t; i++) {
					 int sum =0;
				     System.out.println("Enter the size of Array");
				     int a = sc.nextInt();
				     int p[] = new int [a];
				     System.out.println("Enter the elements: ");
				     for(int j=0; j<a; j++) {
				         p[j] = sc.nextInt();
				         sum=sum+p[j];
				     }
				     System.out.println("Sum of Elements of Array is: "+sum);
//				 System.out.println("Sum will be: ");
//				 int sum = 0;
//				 for(int k=0; k<a; k++) {
//				     sum = sum+p[k];
//				 }
//				 System.out.println(sum);
//			}
	}
  }
}	
		