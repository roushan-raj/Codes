package apnikaksha;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner (System.in);
	     System.out.println("Enter a number");
	     int n = sc.nextInt();
	     
	     int temp = n;
	     int reverse = 0;
	     
	     while (temp>0) {
	    	 int lastDigit = temp % 10;
	    	 reverse = reverse * 10 + lastDigit;
	    	 temp /= 10;
	     }
	    if (reverse == n)
	    	System.out.println(n+" is Palindrome Number");
	    else
	    	System.out.println(n+" is not Palindrome Number");
	}

}
