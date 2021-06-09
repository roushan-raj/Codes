
public class InsertElementsInQueue {
	
	private ListNode front;
	private ListNode rear;
	private int length;
	
	public class ListNode {
		private ListNode next;
		private int data;
		
		public ListNode (int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public int length() {
		return length;
	}
	
	public boolean isEmpty() {
		return length == 0;
	}
	
	public void enqueue(int data) {
		ListNode temp = new ListNode(data);
		if (isEmpty()) {
			front = temp;
		} else {
			rear.next = temp;
		}
		rear = temp;
		length++;
	}
	
	public void printQueue () {
		if (front == null) {
			return;
		}
		ListNode current = front;
		while(current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.println(current);
	}

	public static void main(String[] args) {
		 
		InsertElementsInQueue queue = new InsertElementsInQueue();
		queue.enqueue(10);
		queue.enqueue(15);
		queue.enqueue(20);
		queue.printQueue();

	}

}
