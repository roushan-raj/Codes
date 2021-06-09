package apnikaksha;

import java.util.Scanner;

public class HamiltonianAndLagrangian {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the marks of Student");
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			boolean isLarge = true;
			for(int j=i+1;j<n;j++) {
			if(a[j]>=a[i]) {
				isLarge = false;
			}
		  }	
			if(isLarge)
				System.out.print(a[i]+" ");
 		}

	}

}
