
public class InsertNodeAtBeginningSLL {
	
	private static class ListNode {
		private int data;
		private ListNode next;
		
		public ListNode (int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void display(ListNode head) {     // Prints all elements of Linked List
		if(head == null) {
			return;
		}
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + " - - > ");
			current = current.next;
		}
		System.out.println(current);
		
	}
	
	// Insert new Node at Beginning of Linked List
	public ListNode insertAtBeginning(ListNode head, int data) { 
		ListNode newNode = new ListNode(data);
		if (head == null) {
			return newNode;
		}
		newNode.next = head;
		head = newNode;
		return head;
		
	}

	public static void main(String[] args) {
		
		ListNode head = new ListNode(11);
		ListNode second = new ListNode(22);
		ListNode third = new ListNode(33);
		ListNode fourth = new ListNode(44);
		
		head.next = second;
		second.next = third;
		third.next = fourth;
		
		InsertNodeAtBeginningSLL LL = new InsertNodeAtBeginningSLL();
		LL.display(head);
		ListNode newHead = LL.insertAtBeginning(head, 55);
		System.out.println();
		System.out.println("Linked List after Insertion of new Node : ");
		LL.display(newHead);

	}

}