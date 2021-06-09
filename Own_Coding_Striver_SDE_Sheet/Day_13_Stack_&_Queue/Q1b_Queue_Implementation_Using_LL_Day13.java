
public class Q1b_Queue_Implementation_Using_LL_Day13 {
	
	private listnode front;
	private listnode rear;
	private int length;
	
	private class listnode {
		private int data;
		private listnode next;
		
		public listnode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public Q1b_Queue_Implementation_Using_LL_Day13() {
		front = null;
		rear = null;
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
	
	public void enQueue(int data) {
		listnode temp = new listnode(data);
		if(isEmpty()) {
			front = temp;
		} else {
			rear.next = temp;
		}
		rear = temp;
		length++;
	}
	
	public int deQueue() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}
		int result = front.data;
		front = front.next;
		if(front == null)
			rear = null;
		
		length--;
		return result;
	}
	
    public int showFirstElement() {
    	if(isEmpty()) {
			System.out.println("Queue is empty");;
		}
    	int firstElement = front.data;
    	return firstElement;
    }
    
    public void print() {
    	if(isEmpty()) {
			System.out.println("Queue is empty");;
		}
    	listnode current = front;
    	while(current != null) {
    		System.out.print(current.data+"-->");
    		current = current.next;
    	}
    	System.out.println("null");
    }

	public static void main(String[] args) {
		Q1b_Queue_Implementation_Using_LL_Day13 ob = new Q1b_Queue_Implementation_Using_LL_Day13();
		ob.enQueue(10);
		ob.enQueue(20);
		ob.enQueue(30);
		ob.enQueue(40);
		
		ob.print();
		System.out.println("Current length of Queue: "+ob.length());
		System.out.println("First element is: "+ob.showFirstElement()+"\n");
		
		System.out.println("Deleted element is: "+ob.deQueue()+"\n");
		
		ob.print();
		System.out.println("Current length of Queue: "+ob.length());
		System.out.println("First element is: "+ob.showFirstElement());
	}
}
