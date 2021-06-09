
public class SearchAElementInSLL {

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
	
	public boolean find(ListNode head, int key) {
		if (head == null) {
			System.out.println("Linked list has no Element.");
		}
		
		ListNode current = head;
		int count = 1;
		while (current != null) {
			if (current.data == key) {
				System.out.println("Element is found at index : " + count);
				return true;
			}
			current = current.next;
			count++;
		}
		System.out.println("Element is not found");
		return false;
	}

	public static void main(String[] args) {
		
		ListNode head = new ListNode(11);
		ListNode second = new ListNode(22);
		ListNode third = new ListNode(33);
		ListNode fourth = new ListNode(44);
		
		head.next = second;
		second.next = third;
		third.next = fourth;
		
		SearchAElementInSLL LL = new SearchAElementInSLL();
		LL.display(head);
		LL.find(head, 44);
    }
}
