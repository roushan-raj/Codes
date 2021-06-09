package apnikaksha;

import java.util.Scanner;

public class MethodIntroduction {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the 1st number");
		int a =sc.nextInt();
		System.out.println("Enter the 2nd number");
		int b= sc.nextInt();
		
		maxOf(a,b);
		int result = maxOf(a,b);
		System.out.println("Maximum number is: "+result);



	}
	
	static int maxOf(int a,int b) {
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
	}

}
