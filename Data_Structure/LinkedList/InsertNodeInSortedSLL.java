
public class InsertNodeInSortedSLL {

private ListNode head;
	
	private static class ListNode {
		
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	// Node insertion to make linked list
	public void insertNodeAtBegnining (int data) {
		ListNode newNode = new ListNode (data);
			newNode.next = head;
			head = newNode;
	}
	
	// Prints all elements of Linked List
	public void display() {     
		if(head == null) {
			return;
		}
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.println("null");	
	}
	
	// Insert Node at sorted place
	public ListNode insertAtSortedPlace (int data) {
		
		ListNode newNode = new ListNode(data);
		if (head == null) {
			return head;
		}
		
		
		ListNode current = head;
		ListNode temp = null;
		while (current != null && current.data < newNode.data) {
			temp = current;
			current = current.next;
		}
		//newNode.next = current;
		temp.next = newNode;
		newNode.next = current;
		return head;
	}
	
	public static void main(String[] args) {
		 
		InsertNodeInSortedSLL LL = new InsertNodeInSortedSLL();
		
		LL.insertNodeAtBegnining(77);
		LL.insertNodeAtBegnining(66);
		LL.insertNodeAtBegnining(55);
		LL.insertNodeAtBegnining(44);
		LL.insertNodeAtBegnining(33);
		LL.insertNodeAtBegnining(22);
		LL.insertNodeAtBegnining(11);
		
		LL.display();
		
		LL.insertAtSortedPlace(62);
		
		LL.display();
		

	}

}
