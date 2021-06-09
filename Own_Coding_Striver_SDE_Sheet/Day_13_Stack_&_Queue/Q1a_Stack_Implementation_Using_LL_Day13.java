import java.util.EmptyStackException;

public class Q1a_Stack_Implementation_Using_LL_Day13 {
	
	private listNode top;
	private int length;
	
	private class listNode{
		private int data;
		private listNode next;
		
		public listNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public Q1a_Stack_Implementation_Using_LL_Day13() {
		top = null;
		length = 0;
	}
	
	public int length() {
		return length;
	}
	
	public boolean isEmpty() {
		if(length == 0)
			return true;
		return false;
	}
	
	public void push(int data) {
		listNode temp = new listNode(data);
		temp.next = top;
		top = temp;
		length++;
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		int result = top.data;
		top = top.next;
		length--;
		return result;
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		int topElement = top.data;
		return topElement;
	}

	public static void main(String[] args) {
		Q1a_Stack_Implementation_Using_LL_Day13 ob = new Q1a_Stack_Implementation_Using_LL_Day13();
		ob.push(10);
		ob.push(20);
		ob.push(30);
		ob.push(40);
		
		System.out.println("No.of elements in stack: "+ob.length());
		System.out.println("Top element is: "+ob.peek()+"\n");
		
		ob.pop();
		
		System.out.println("No.of elements in stack: "+ob.length());
		System.out.println("Top element is: "+ob.peek());
	}
}
