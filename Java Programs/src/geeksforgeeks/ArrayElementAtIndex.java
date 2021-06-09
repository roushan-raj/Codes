package geeksforgeeks;

import java.util.Scanner;

public class ArrayElementAtIndex {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter test Cases");
		int t= sc.nextInt();
		
		for(int i=0; i<t; i++) {
			System.out.println("Enter size of Array");
			int s= sc.nextInt();
			int a[] = new int [s];
			
			System.out.println("Enter position of Array");
			int p= sc.nextInt();
			
			System.out.println("Enter Elements: ");
			for(int j=0; j<s; j++) {
				a[j]=sc.nextInt();
			}
			System.out.println("Value of Element is: "+a[p]);
		}

	}

}
