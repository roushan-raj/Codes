package apnikaksha;

import java.util.*;
import java.lang.*;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 1st Number");
		int a=sc.nextInt();
		
		System.out.println("Enter the 2nd Number");
		int b=sc.nextInt();
		
		System.out.println("Enter the Operation");
		sc.nextLine();
		char operation = sc.nextLine().charAt(0);
		
		int result=0;
		
		switch(operation)
		{
		case '+':
			result = a+b;
			break;
			
		case '-':
			result = a-b;
			break;
			
		case '*':
			result = a*b;
			break;
			
		case '/':
			result = a/b;
			break;
		default:
			System.out.println("Invalid Operation");
        }
		
		System.out.println("The Result is: " +result);
		
		
		
		
		
		

	}

}
