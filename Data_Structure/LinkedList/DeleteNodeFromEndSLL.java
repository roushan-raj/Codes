
public class DeleteNodeFromEndSLL {
	
	private static class ListNode {
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void display(ListNode head) {
		if (head == null)
			return;
		
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.println(current);
	}
	
	public ListNode deleteFromEnd (ListNode head) {
		if (head == null)
			return head;
		
		ListNode temp = head;
		ListNode previousToTemp = null;
		while (temp.next != null) {
			previousToTemp = temp;
			temp = temp.next;
		}
		previousToTemp.next = null;		
		return temp;				
	}

	public static void main(String[] args) {
		 
		ListNode head = new ListNode (10);
		ListNode second = new ListNode (20);
		ListNode third = new ListNode (30);
		ListNode fourth = new ListNode (40);
		
		head.next = second;
		second.next = third;
		third.next = fourth;
		
		DeleteNodeFromEndSLL LL = new DeleteNodeFromEndSLL();
		LL.display(head);
		ListNode last = LL.deleteFromEnd(head);
		System.out.println("Deleted last Node is : "+ last.data);
		LL.display(head);

	}

}
