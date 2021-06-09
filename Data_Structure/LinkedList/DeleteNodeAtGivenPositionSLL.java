
public class DeleteNodeAtGivenPositionSLL {

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
	
	public int printLength(ListNode head) {   // Prints Length  of Linked List
		if (head == null) {
			System.out.println("Empty List");
		}
		int count = 0;
		ListNode current = head;
		while (current != null) {
			current = current.next;
			count++;
		}
		//System.out.println("Length of Linked List is : " + count);
		return count;
	}
	
	public ListNode deleteNodeAtGivenPosition (ListNode head, int position) {
		int size = printLength(head);
		if (position > size || position < 1) {
			System.out.println("Position is incorrect");
	        return head;
		}    
		
		if (position == 1) {
			ListNode temp = head;
			head = head.next;
			temp.next = null;
			return temp;
			
		}  else {
		
				ListNode previous = head;
				int count = 1;
				while(count < position-1) {
					previous = previous.next;
					count++;
				 }
				ListNode current = previous.next;
				previous.next = current.next;
				current.next = null;
				return current;
		
	   }
		
	}

	public static void main(String[] args) {
		 
		ListNode head = new ListNode (10);
		ListNode second = new ListNode (20);
		ListNode third = new ListNode (30);
		ListNode fourth = new ListNode (40);
		
		head.next = second;
		second.next = third;
		third.next = fourth;
		
		DeleteNodeAtGivenPositionSLL LL = new DeleteNodeAtGivenPositionSLL();
		LL.display(head);
		ListNode thirdNode = LL.deleteNodeAtGivenPosition(head, 2);
		System.out.println("Deleted Node is : " + thirdNode.data);
		LL.display(head);

	}

}