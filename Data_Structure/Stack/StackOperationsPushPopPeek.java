
public class StackOperationsPushPopPeek {

		private ListNode top;
		private int length;
		
		private class ListNode {
			private int data;
			private ListNode next;
			
			public ListNode (int data) {
				this.data = data;
			} 
		}
		
		public void Stack () {
			top = null;
			length = 0;
		}
		
		public int length () {
			return length;
		}
		
		public boolean isEmpty () {
			return length == 0;
		}
		
		// Push Operation
		public void push (int data) {
			ListNode temp = new ListNode (data);
			if (top == null) {
				top = temp;
			} else {
			temp.next = top;
			top = temp;
			length++;
			}
		}
		
		// Pop Operation
		public int pop(int data) {
			if (isEmpty()) {
				System.out.println("Stack is Empty");
			}
			int result = top.data;
			top = top.next;
			length--;
			return result;
		}
		
		// Peek Operation
		public int peek () {
			if (isEmpty()) {
				System.out.println("Stack is Empty"); 
			}
			return top.data;
		}

	public static void main(String[] args) {
		
		StackOperationsPushPopPeek stack = new StackOperationsPushPopPeek();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		System.out.println(stack.peek());
		stack.pop(40);
		System.out.println(stack.peek());

	}

}
