
public class InsertNodeAfterAGivenPosition {
	
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
	
	public ListNode insertAfterAGivenPosition (ListNode head, int data, int position) {
		
		// check boundary condition
		int size = printLength(head);
		if (position > size + 1 || position < 1) {
			System.out.println("Invalid position");
			return head;
		}
		
		ListNode newNode = new ListNode(data);
		if (position == 1) {
			newNode.next = head;
			return newNode;
		} else {
			ListNode previous = head;
			int count = 1;
			while (count < position - 1) {
				previous = previous.next;
				count ++;
			}
			
			ListNode current = previous.next;
			newNode.next = current;
			previous.next = newNode;
			return head;
		}
		
	}

	public static void main(String[] args) {
		
		ListNode head = new ListNode(10);
		ListNode second = new ListNode(20);
		ListNode third = new ListNode(30);
		ListNode fourth = new ListNode(40);
		
		head.next = second;
		second.next = third;
		third.next = fourth;
		
		InsertNodeAfterAGivenPosition LL = new InsertNodeAfterAGivenPosition();
		LL.display(head);
		System.out.println();
		System.out.println("New Linked List : ");
		LL.insertAfterAGivenPosition(head, 99, 3);
		LL.display(head);

	}

}
