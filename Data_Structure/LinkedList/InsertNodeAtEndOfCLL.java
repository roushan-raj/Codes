
public class InsertNodeAtEndOfCLL {
	
	private ListNode last;
	private int length;
	
	private class ListNode {
		private int data;
		private ListNode next;
		
		public ListNode (int data) {
			this.data = data;
		}
		
		public void PrintElementsOfCircularSLL() {
			last = null;
			length = 0;
		}
	}
	
	public int length () {
		return length;
	}
	
	public boolean isEmpty() {
		return length == 0;
	}
	
	// Insert Nodes at End of CLL
	public void insertNodeAtEnd(int data) {
		ListNode newNode = new ListNode (data);
		if (last == null) {
			last = newNode;
			last.next = last;
		} else {
			newNode.next = last.next;
			last.next=newNode;
			last = newNode;
		}	
		length++;		
	}
	
	// Prints all elements of circular singly linked list 
	public void displayCLL () {
		if (last == null) {
			return;
		}
		
		ListNode first = last.next;
		while (first != last) {
			System.out.print(first.data + " --> ");
			first = first.next;
		}
		System.out.print(first.data);
	}


	public static void main(String[] args) {
		 
		InsertNodeAtEndOfCLL CLL = new InsertNodeAtEndOfCLL();
		CLL.insertNodeAtEnd(10);
		CLL.insertNodeAtEnd(20);
		CLL.insertNodeAtEnd(30);
		CLL.insertNodeAtEnd(40);
		
		CLL.displayCLL();

	}

}
