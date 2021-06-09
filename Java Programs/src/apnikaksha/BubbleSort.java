package apnikaksha;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of items to be sorted");
		int n=sc.nextInt();
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
		int temp;
		for(int i=0;i<n-1;i++) {             // From here onwards code of bubble sort started
			
			boolean sorted = true;
			
			for(int j=0;j<n-1-i;j++) {       // -i is added in inner loop for more optimization of our sorting process 
				if(a[j+1] < a[j]) {             
					temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
					
					sorted = false;
				}
			}
			if(sorted) break;
		}
		System.out.println("Sorted array are: ");
		for(int item: a) {
			System.out.print(+item+ " ");
		}
	}

}
