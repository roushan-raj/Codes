package apnikaksha;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of items to be sorted");
		int n = sc.nextInt();
		int a[] = new int [n];
		
		System.out.println("Enter the numbers to be Sorted");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Entered numbers are: ");
		for(int i=0;i<n;i++) {
			System.out.print(a[i] +" ");		
		}
		System.out.println();
		
		for(int i=0;i<n-i;i++) {
			int minIndex = i;
			for(int j=i;j<n;j++) {
				if(a[j] < a[minIndex]) {
					minIndex = j;
				}
			}
			int temp = a[i];
			a[i] = a[minIndex];
			a[minIndex] = temp;
			
		}
		System.out.println("sorted number is: ");
		for (int item: a) {
			System.out.print(item+ " ");
		}
			
	}

}
