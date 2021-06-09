
public class InsertNodeAfterAGivenNodeSLL {
	
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
	
	public void InsertAfterGivenNode (ListNode previous, int data) {
		if (previous == null) {
			System.out.println("The given previous given node cannot be null");
		}
		ListNode newNode = new ListNode(data);
		newNode.next = previous.next;
		previous.next = newNode;
	} 

	public static void main(String[] args) {
		
		ListNode head = new ListNode(10);
		ListNode second = new ListNode(20);
		ListNode third = new ListNode(30);
		ListNode fourth = new ListNode(40);
		
		head.next = second;
		second.next = third;
		third.next = fourth;
		
		InsertNodeAfterAGivenNodeSLL LL = new InsertNodeAfterAGivenNodeSLL();
		LL.display(head);
		System.out.println();
		System.out.println("New Linked List is : ");
		LL.InsertAfterGivenNode(third, 99);
		LL.display(head);
	}

}
