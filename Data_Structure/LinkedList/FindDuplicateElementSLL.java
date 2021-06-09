
public class FindDuplicateElementSLL {
	
	private ListNode head;
	
	private static class ListNode {
		
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void insertNodeAtBegnining (int data) {
		ListNode newNode = new ListNode (data);
			newNode.next = head;
			head = newNode;
	}
	
	public void display() {     // Prints all elements of Linked List
		if(head == null) {
			return;
		}
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.println("null");	
	}
	
	// remove duplicate elements 
	public void removeDuplicateElement () {
		if (head == null) {
			return;
		}
		ListNode current = head;
		while (current != null && current.next != null) {
			if (current.data == current.next.data) {
				current.next = current.next.next;
			} else {
				current = current.next;
			}
		}
	}

	public static void main(String[] args) {
		 
		FindDuplicateElementSLL LL = new FindDuplicateElementSLL();
		
		LL.insertNodeAtBegnining(55);
		LL.insertNodeAtBegnining(44);
		LL.insertNodeAtBegnining(44);
		LL.insertNodeAtBegnining(44);
		LL.insertNodeAtBegnining(22);
		LL.insertNodeAtBegnining(22);
		LL.insertNodeAtBegnining(11);
		
		LL.display();
		LL.removeDuplicateElement();
		LL.display();

	}

}
