
public class RemoveGivenKeyFromSLL {
	
private ListNode head;
	
	private static class ListNode {
		
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	// Node insertion to make linked list
	public void insertNodeAtBegnining (int data) {
		ListNode newNode = new ListNode (data);
			newNode.next = head;
			head = newNode;
	}
	
	// Prints all elements of Linked List
	public void display() {     
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
	
	public void removeGivenKey(int key) {
		ListNode current = head;
		ListNode temp = null;
		
		if (current != null && current.data == key) {
			head = current.next;
			return;
		}
		
		while (current != null && current.data != key) {
			temp = current;
			current = current.next;
		}
		if (current == null)  {
			return;
		}
		temp.next = current.next;
		
	}

	public static void main(String[] args) {
		 
		RemoveGivenKeyFromSLL LL = new RemoveGivenKeyFromSLL();
		
		LL.insertNodeAtBegnining(77);
		LL.insertNodeAtBegnining(66);
		LL.insertNodeAtBegnining(55);
		LL.insertNodeAtBegnining(44);
		LL.insertNodeAtBegnining(33);
		LL.insertNodeAtBegnining(22);
		LL.insertNodeAtBegnining(11);
		
		LL.display();
		
		LL.removeGivenKey(55);
		
		LL.display();

	}

}
