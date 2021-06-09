import java.util.*;
public class Q5_Method1_MostOptimal_Day13 {
	
	public void parenthesesChecker(String str) {
		int n = str.length();
		Stack<Character> s = new Stack<>();	
		
		for(int i=0; i<n; i++) {
			char c = str.charAt(i);
			if((c == '(') || (c == '{') || (c == '[')) {
				s.push(c);
			} 
			else if ( !s.isEmpty() && ((c == ')') && (s.peek() == '(')) || 
					                  ((c == '}') && (s.peek() == '{')) ||
					                  ((c == ']') && (s.peek() == '['))) {
				s.pop();
			}
			else {
				s.push(c);
			}
		}
		
		if(s.isEmpty()) {
			System.out.println("Balanced Parentheses");
		} else {
			System.out.println("Unbalanced Parentheses");
		}
	}
	public static void main(String[] args) {
		Q5_Method1_MostOptimal_Day13 ob = new Q5_Method1_MostOptimal_Day13();
		String str1 = "{()}[]", str2 = "{()}[", str3 = "{()}[}";
		ob.parenthesesChecker(str1);
		ob.parenthesesChecker(str2);
		ob.parenthesesChecker(str3);
	}
}
