package apnikaksha;

import java.util.Scanner;

public class TwoArrayAddition {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the size of both array");
	        int p = sc.nextInt();
	        
	        int a[] = new int[p];
	        int b[] = new int[p];
	        int c[] = new int[p];
	        
	        
	        System.out.println("Enter the elements of 1st Array");
	        for(int i=0;i<p;i++)  {
	            a[i] = sc.nextInt();
	        }
	        
	        System.out.println("Enter the elements of 2nd Array");
	        for(int j=0;j<p;j++)  {
	            b[j] = sc.nextInt();
	        }
	        
	        for(int i=0;i<p;i++){
	             c[i] = a[i] + b[i];  
	          }
	         
	        System.out.println("Added Array is: ");
	        for (int item: c) {
	           System.out.print(item+" ");
	        }
	}

}
