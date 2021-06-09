
public class InsertNodeAtEndOfSLL {
	
	private static class ListNode {
		private int data;
		private ListNode next;
	
	public ListNode (int data) {
		this.data = data;
		this.next = null;
		
	   }
	}
	
	public void display(ListNode head) {
		if(head == null)
			return;
		
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.println(current);
	}
	
	// insertion of node at the End of Linked list
	public ListNode insertAtEnd (ListNode head, int data) {
		ListNode newNode = new ListNode(data);
		if (head == null)
			return newNode;
		
		ListNode current = head;
		while(null != current.next) {
			current = current.next;
		}
		current.next = newNode;
		return head;
		
	}
	
	public static void main(String[] args) {
		
		ListNode head = new ListNode(10);
		ListNode second = new ListNode(20);
		ListNode third = new ListNode(30);
		ListNode fourth = new ListNode(40);
		
		head.next = second;
		second.next = third;
		third.next = fourth;
		
		InsertNodeAtEndOfSLL LL = new InsertNodeAtEndOfSLL();
		LL.display(head);
		System.out.println();
		System.out.println("New Linked List is : ");
		LL.insertAtEnd(head, 45);
		LL.display(head);

	}

}
