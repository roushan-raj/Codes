
public class InsertNodeAtBeginningOfCLL {
	
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
	
	// Insert Nodes at the Beginning of Linked List
	public void insertAtBeginning(int data) {
		ListNode newNode = new ListNode (data);
		if (last == null) {
			last = newNode;
			last.next = newNode;
		} else {
			newNode.next = last.next;
			last.next = newNode;
		}
		//last.next = newNode;
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
		 
		InsertNodeAtBeginningOfCLL CLL =  new InsertNodeAtBeginningOfCLL();
		CLL.insertAtBeginning(10);
		CLL.insertAtBeginning(20);
		CLL.insertAtBeginning(30);
		CLL.insertAtBeginning(40);
		
		CLL.displayCLL();

	}

}
