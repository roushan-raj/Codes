
public class ReverseSinglyLinkedList {

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
	
	/*public void reverseLinkedList (ListNode head) {
		if (head == null) {
			System.out.println("No element present");
		}
		
		ListNode last = head;
		ListNode previousToLast=null;
		while (last.next != null) {
			previousToLast.next = last;
			last = last.next;
		}
		last.next = head;
		previousToLast.next = null;
		last = head;
	}*/
	
	public ListNode reverseLinkedList (ListNode head) {
		if (head == null) {
			return head;
		}
		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;
		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}


	public static void main(String[] args) {
		
		ListNode head = new ListNode(11);
		ListNode second = new ListNode(22);
		ListNode third = new ListNode(33);
		ListNode fourth = new ListNode(44);
		
		head.next = second;
		second.next = third;
		third.next = fourth;
		
		ReverseSinglyLinkedList LL = new ReverseSinglyLinkedList();
		LL.display(head);
		ListNode reverseListNodehead = LL.reverseLinkedList(head);
		System.out.print("Reversed linked list is : " );
		LL.display(reverseListNodehead);

	}

}
