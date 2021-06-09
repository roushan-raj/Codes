
public class FindLoopInSLL {
	
	private static ListNode head;

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
	
	public boolean containsLoop () {
		ListNode fastPtr = head;
		ListNode slowPtr = head;
		
		while (fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			
			if (slowPtr == fastPtr) {
				System.out.println("This Linked list contains loop");
				return true;
			}
		}
		System.out.println("This Linked list does not contains loop");
		return false;
	}
	
	public void createLinkedListWithLoop () {
		
		ListNode first = new ListNode(11);
		ListNode second = new ListNode(22);
		ListNode third = new ListNode(33);
		ListNode fourth = new ListNode(44);
		ListNode fifth = new ListNode(55);
		ListNode sixth = new ListNode(66);
		ListNode seventh = new ListNode(77);
		ListNode eighth = new ListNode(88);
		ListNode ninth = new ListNode(99);
		ListNode tenth = new ListNode(111);
		
		head = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = seventh;
		seventh.next = eighth;
		eighth.next = ninth;
		ninth.next = tenth;
		tenth.next = fifth;
		
	}
	
	public static void main(String[] args) {
		
		FindLoopInSLL LL = new FindLoopInSLL();
		LL.createLinkedListWithLoop();
		LL.containsLoop();
		
	}
}