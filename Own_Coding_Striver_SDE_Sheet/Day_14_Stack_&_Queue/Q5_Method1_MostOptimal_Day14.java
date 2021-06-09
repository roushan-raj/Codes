import java.util.*;
public class Q5_Method1_MostOptimal_Day14 {
	
	Stack<Integer> s = new Stack<>();
	int min = 0;
	
	public void push(int x) {
		if(s.isEmpty()) {
			s.push(x);
			min = x;
		} 
		else {
			if(x > min) {
				s.push(x);
			} 
			else {
				if(x < min) {
					s.push(2*x - min);
					min = x;
				}
			}
		}
	}
	
	public void pop() {
		if(s.isEmpty())
			System.out.println("Stack is empty");
		
		int temp = s.peek();
		if(temp > min) {
			s.pop();
		}
		else {
			if(temp < min) {
				min = 2*min - temp;
				s.pop();
			}
		}
	}
	
	public int top() {
		if(s.isEmpty())
			return -1;
		else {
			if(s.peek() > min) 
				return s.peek();
			
			else {
				if(s.peek() < min) 
					return min;
			}
		}
		return min;
	}
	
	public int getMin() {
		if(s.isEmpty())
			return -1;
		return min;
	}

	public static void main(String[] args) {
		Q5_Method1_MostOptimal_Day14 ob = new Q5_Method1_MostOptimal_Day14();
		ob.push(5);
		ob.push(7);
		ob.push(3);
		System.out.println(ob.getMin());
		ob.pop();
		System.out.println(ob.top());
		System.out.println(ob.getMin());
	}
}
