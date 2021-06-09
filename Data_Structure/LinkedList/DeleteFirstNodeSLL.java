
public class DeleteFirstNodeSLL {
	
	ListNode head;
	
	private static class ListNode {
		private int data;
		private ListNode next;
		
		public  ListNode (int data) {
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
	
	public ListNode deleteFirst (ListNode head) {
		if (head == null)
			return head;
		
		ListNode temp = head;
		head = head.next;
		temp.next = null;
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
		
		DeleteFirstNodeSLL LL = new DeleteFirstNodeSLL();
		LL.display(head);
		ListNode first = LL.deleteFirst(head);
		System.out.println("Deleted node is : " + first.data);
		LL.display(second);

	}

}
