package apnikaksha;

import java.util.Scanner;

public class ReverseStringWordByWord {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your String");
		String str = sc.nextLine();
		
		int i = str.length() - 1;
		String ans = "";
		
		while(i>=0) {
			while(i>=0 && str.charAt(i) == ' ') i--;
			
			int j=i;
			
			if(i<0) break;
			
			while(i>=0 && str.charAt(i) != ' ') i--;
			
			if(ans.isEmpty()) {
				ans = ans.concat(str.substring(i+1, j+1));
			} else {
				ans = ans.concat(" "+str.substring(i+1, j+1));
			}
				
		}
		
		System.out.println("Reversed String is: "+ans);
		 
	}

}
