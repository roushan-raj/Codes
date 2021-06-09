
public class Q1_Method1_MostOptimal_Day5 {
	
	private static listNode head;
	
	private class listNode{
		private int val;
		private listNode next;
		
		public listNode(int x) {
			this.val = x;
			this.next = null;
		}
	}
	
	// Inserting nodes at the start of the linked list
	public void insertNodeAtBeginning(int data) {
		listNode newNode = new listNode(data);
		newNode.next = head;
		head = newNode;
	} 
	
	public listNode reverseList(listNode head) {
		listNode newhead = null;
		while(head != null) {
			listNode next = head.next;
			head.next = newhead;
			newhead = head;
			head = next;
		}
		return newhead;
	}
	
	public void display(listNode newhead) {
		listNode current = newhead;
		while(current != null) {
			System.out.print(current.val + "-->");
			current = current.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
	
		Q1_Method1_MostOptimal_Day5 ob = new Q1_Method1_MostOptimal_Day5();
		ob.insertNodeAtBeginning(5);
		ob.insertNodeAtBeginning(4);
		ob.insertNodeAtBeginning(3);
		ob.insertNodeAtBeginning(2);
		ob.insertNodeAtBeginning(1);
		System.out.println("Given Linked list is: ");
		ob.display(head);
		
		listNode newHeadAfterReverse = ob.reverseList(head);
		
		System.out.println("Reversed Linked list is: ");
		ob.display(newHeadAfterReverse);
		
	}
}
