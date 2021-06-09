package apnikaksha;

import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size of Array");
		int n = sc.nextInt();
		System.out.println("size of array is: "+n);
		int a[] = new int [n];
		int b[] = new int [n];
		int temp=0;
		System.out.println("Enter the elements of Array");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=n-1;i>=0;i--) {
			b[temp] = a[i];
			temp++;
		}
		System.out.println("Reversed array is: ");
		for(int item:b) {
			System.out.print(item+" ");
		}
			
		
	}

}
