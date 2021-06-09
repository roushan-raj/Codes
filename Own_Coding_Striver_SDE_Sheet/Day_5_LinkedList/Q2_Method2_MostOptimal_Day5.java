
public class Q2_Method2_MostOptimal_Day5 {
	
	private static listNode head;
	
	private class listNode{
		private int data;
		private listNode next;
		
		public listNode(int x) {
			this.data = x;
			this.next = null;
		}
	}
	
	public void insertNodeAtBeginning(int data) {
		listNode newNode = new listNode(data);
		newNode.next = head;
		head = newNode;
	} 
	
	public void display(listNode head) {
		listNode current = head;
		while(current != null) {
			System.out.print(current.data + "-->");
			current = current.next;
		}
		System.out.print("null");
		System.out.println();
	}
	
	public void middleOfLinkedList(listNode head) {
		listNode slow = head;
		listNode fast = head;
		while(fast.next != null && fast != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println("Middle element is: "+slow.data);
	}

	public static void main(String[] args) {
		 
		Q2_Method2_MostOptimal_Day5 ob = new Q2_Method2_MostOptimal_Day5();
		//ob.insertNodeAtBeginning(8);
		ob.insertNodeAtBeginning(7);
		ob.insertNodeAtBeginning(6);
		ob.insertNodeAtBeginning(5);
		ob.insertNodeAtBeginning(4);
		ob.insertNodeAtBeginning(3);
		ob.display(head);
		ob.middleOfLinkedList(head);
	}
}
