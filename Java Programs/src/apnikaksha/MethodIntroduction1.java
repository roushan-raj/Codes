package apnikaksha;

import java.util.Scanner;

public class MethodIntroduction1 {

	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number");
		int c = sc.nextInt();
		System.out.println("Enter Second number");
		int d = sc.nextInt();
		
		swap(c,d);
		System.out.println("value of c is: "+c+" value of d is: "+d);
		//System.out.println("value of c is: "+a+" value of d is: "+b);
	
	}
	static int temp;
   static void swap(int a,int b) {
		temp = a;
		a = b;
		b = temp;
	}

}
