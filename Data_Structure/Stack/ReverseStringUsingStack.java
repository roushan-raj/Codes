import java.util.Scanner;
import java.util.Stack;

public class ReverseStringUsingStack {
	
	public String reverse(String str) {
		
		Stack <Character> stack = new Stack<>();
		char [] chars = str.toCharArray();
		for (char c : chars) {
			stack.push(c);
		   }
		for (int i=0;i<chars.length;i++) {
			chars [i] = stack.pop();
		   }
		return new String(chars); 		
		}
  
	public static void main(String[] args) {
		 
		ReverseStringUsingStack rev = new ReverseStringUsingStack();
		
		Scanner kb = new Scanner (System.in);
		System.out.print("Enter a string : ");
		String str = kb.next();
		System.out.print("Reversed string is : " + rev.reverse(str));
		kb.close();

	}

}
