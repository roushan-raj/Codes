
public class InsertNodeAtBeginingAndPrintListDLL {
	
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
	
	public InsertNodeAtBeginingAndPrintListDLL () {
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
	
	// inserting nodes at the beginning
	public void insertFirst (int value) {
		ListNode newNode = new ListNode (value);
		if (isEmpty()) {
			tail = newNode;
		} else {
			head.previous = newNode;
			newNode.next = head;
		}
		//newNode.next = head;
		head = newNode;
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
		
		InsertNodeAtBeginingAndPrintListDLL DLL = new InsertNodeAtBeginingAndPrintListDLL();
		DLL.insertFirst(40);
		DLL.insertFirst(30);
		DLL.insertFirst(20);
		DLL.insertFirst(10);
		
		DLL.displayForward();
		DLL.displayBackward();

	}

}
