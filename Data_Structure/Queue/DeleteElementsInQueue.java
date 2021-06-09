import java.util.NoSuchElementException;

public class DeleteElementsInQueue {
	
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
	
	public void enQueue(int data) {
		ListNode temp = new ListNode(data);
		if (isEmpty()) {
			front = temp;
		} else {
			rear.next = temp;
		}
		rear = temp;
		length++;		
	}
	
	public int deQueue () {	
		if(isEmpty()) {
			System.out.println("Queue is Empty");
		} 
			int temp = front.data;
			front = front.next;
			if (front == null) {
				rear = null;
			}
			length--;
		    return temp;	
	}
	
	public int first() {
		if (isEmpty()) {
			throw new NoSuchElementException("Queue is already empty");
		}
		return front.data;
	}
	
	public int last() {
		if (isEmpty()) {
			throw new NoSuchElementException("Queue is already empty");
		}
		return rear.data;
	}
	
	public void printArray() {
		ListNode current = front;
		if (front == null) {
			return;
		}
		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.println(current);
	}
	

	public static void main(String[] args) {
		 
		DeleteElementsInQueue queue = new DeleteElementsInQueue();
		
       queue.enQueue(10);
       queue.enQueue(15);
       queue.enQueue(25);
        
       queue.printArray();
        
        System.out.println("Deleted element is : " + queue.deQueue());
        System.out.println("Deleted element is : " + queue.deQueue());
        
        
        //System.out.println(queue.first());
        //System.out.println(queue.last());
        
        
        queue.printArray();

	}

}
