
public class LengthOfSinglyLL {
	
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
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.println(current);
		
	}
	
	public void printLength(ListNode head) {   // Prints Length  of Linked List
		if (head == null) {
			System.out.println("Empty List");
		}
		int count = 0;
		ListNode current = head;
		while (current != null) {
			current = current.next;
			count++;
		}
		System.out.println("Length of Linked List is : " + count);
	}

	public static void main(String[] args) {
		
		ListNode head = new ListNode(11);
		ListNode second = new ListNode(22);
		ListNode third = new ListNode(33);
		ListNode fourth = new ListNode(44);
		
		head.next = second;
		second.next = third;
		third.next = fourth;
		
		LengthOfSinglyLL LL = new LengthOfSinglyLL();
		LL.display(head);
		LL.printLength(head);

	}

}