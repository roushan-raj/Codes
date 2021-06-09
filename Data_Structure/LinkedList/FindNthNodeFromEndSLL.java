
public class FindNthNodeFromEndSLL {
	
	//private ListNode head;

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
	
	// 1st Method to print element from end
	public ListNode nthElementFromEnd (ListNode head, int position) {
		int size = printLength(head);
		if (position > size+1 || position < 0) {
			System.out.println("Invalid position");
		}
					
		if (head == null) {
			return null;
		}
		
		ListNode mainPtr = head;
		ListNode refPtr = head;
		int count = 1;
		while (count <= position) {
			refPtr = refPtr.next;
			count++;
		}
		while (refPtr != null) {
			refPtr = refPtr.next;
			mainPtr = mainPtr.next;
		}
		return mainPtr;
	}
	
	// 2nd Method to print element from end
	public void elementFromEnd (ListNode head , int position) {
		int size = printLength(head);
		if (position > size+1 || position < 0) {
			System.out.println("Invalid position.");
		}
					
		if (head == null) {
			System.out.println("List is empty");
		}
		boolean find=false;
		ListNode current = head;
		for (int i = 1 ; i<=size-position; i++) {
			current = current.next;
			find = true;
		}
		if (find) {
		    System.out.println("Found element is : " + current.data);
		}
	}
	
	

	public static void main(String[] args) {
		
		ListNode head = new ListNode(11);
		ListNode second = new ListNode(22);
		ListNode third = new ListNode(33);
		ListNode fourth = new ListNode(44);
		ListNode fifth = new ListNode(55);
		ListNode sixth = new ListNode(66);
		ListNode seventh = new ListNode(77);
		ListNode eighth = new ListNode(88);
		ListNode ninth = new ListNode(99);
		ListNode tenth = new ListNode(111);
		
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = seventh;
		seventh.next = eighth;
		eighth.next = ninth;
		ninth.next = tenth;
		
		FindNthNodeFromEndSLL LL = new FindNthNodeFromEndSLL();
		LL.display(head);
		ListNode foundElement = LL.nthElementFromEnd(head, 3);
		System.out.println("Found Element is : " + foundElement.data);
		LL.elementFromEnd(head, 4);
	}
}
