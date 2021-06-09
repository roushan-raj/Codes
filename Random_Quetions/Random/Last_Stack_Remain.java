import java.util.*;

public class Last_Stack_Remain {

	int count = 0;
	public int fun(int n) {
		Stack<Integer> st1 = new Stack<>();
		Stack<Integer> st2 = new Stack<>();
		
		for(int i=n; i>=1 ; i--) {
			st1.push(i);
		}
		boolean notEmpty =true;
		while(notEmpty) {
			st1.pop();
			count++;
			int temp = st1.pop();
			if(st1.isEmpty()) {
				return temp;
			}
			while(!st1.isEmpty()) {
				st2.push(st1.pop());
			}
			st1.push(temp);
			while(!st2.isEmpty()) {
				st1.push(st2.pop());
			}
		}	
		return 0;	
	}
	
	public static void main(String[] args) {
		Last_Stack_Remain ob = new Last_Stack_Remain();
	    System.out.println("Last Remaining Card - "+ob.fun(21));
	    System.out.println("Iterations - "+ob.count);
	}
}