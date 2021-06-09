
public class FindMiddleElementSLL {

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
	
	public ListNode getMiddleElement(ListNode head) {
		if (head == null) {
			return null;
		}
		
		ListNode slowPtr = head;
		ListNode fastPtr = head;
		while (fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
		return slowPtr;
	}
	

	public static void main(String[] args) {
		
		ListNode head = new ListNode(11);
		ListNode second = new ListNode(22);
		ListNode third = new ListNode(33);
		ListNode fourth = new ListNode(44);
		ListNode fifth = new ListNode(55);
		
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		
		FindMiddleElementSLL LL = new FindMiddleElementSLL();
		LL.display(head);
		ListNode middleNode = LL.getMiddleElement(head);
		System.out.println("Middle Element is : " + middleNode.data);
	}
}
