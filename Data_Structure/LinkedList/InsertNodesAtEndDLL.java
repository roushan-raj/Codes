
public class InsertNodesAtEndDLL {
	
	private ListNode head;
	private ListNode tail;
	private int length;
	
	private class ListNode{
		private int data;
		private ListNode next;
		private ListNode previous;
		
		public ListNode (int data) {
			this.data = data;
		}
	}
	
	public InsertNodesAtEndDLL () {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}
	
	public boolean isEmpty() {
		return length == 0;
	}
	
	public int lenght() {
		return length;
	}
	
	// inserting nodes at the end of DLL
	public void insertLast(int value) {
		ListNode newNode = new ListNode(value);
		if (isEmpty()) {
			head = newNode;
		} else {
			tail.next = newNode;
			newNode.previous = tail;
		}
		tail = newNode;
		length++;
	}
	

	// Printing list from starting
	public void displayForward () {
		if (head == null) {
			return;
		}
		
		ListNode temp = head;
		while (temp != null) {
			System.out.print(temp.data + " --> ");
			temp = temp.next;
		}
		System.out.println("null");
	}
	
	// Printing list from end
	public void displayBackward () {
		if (head == null) {
			return;
	   }
	
	ListNode temp = tail;
	while (temp != null) {
		System.out.print(temp.data + " --> ");
		temp = temp.previous;
	  }
	System.out.println("null");
	}
	

	public static void main(String[] args) {
		
		InsertNodesAtEndDLL DLL = new InsertNodesAtEndDLL();
		DLL.insertLast(40);
		DLL.insertLast(30);
		DLL.insertLast(20);
		DLL.insertLast(10);
		
		DLL.displayForward();
		//DLL.displayBackward();

	}

}