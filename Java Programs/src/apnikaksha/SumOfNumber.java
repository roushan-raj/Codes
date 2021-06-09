package apnikaksha;

import java.util.Scanner;

public class SumOfNumber {

	public static void main(String[] args) {

     Scanner sc = new Scanner (System.in);
     System.out.println("Enter a number");
     int n = sc.nextInt();
     
     int temp = n;
     int sum = 0;
     
     while(temp>0) {
    	 
    	 int lastDigit = temp % 10;
    	 temp /= 10;
    	 
    	 sum += lastDigit;
    	 System.out.println(lastDigit +" "+ temp +" "+ sum);
     }
      System.out.println("The sum of digit of "+n+ " is "+ sum);

	}

}
