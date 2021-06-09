package apnikaksha;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		 Scanner sc = new Scanner (System.in);
		    System.out.println("Enter your String");
		    String a = sc.nextLine();
		    int n = a.length();
		    char b[] = new char [n];
		    int temp = 0;
		    
		    for(int i=n-1;i>=0;i--) {
		    	 b[temp] = a.charAt(i);	
		    	 temp++;
		    }
	        for(char item: b) {
		    	System.out.print(item);
		    }
		    

	}

}
