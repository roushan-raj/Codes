
public class Q2_Method1_Day5 {
	
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
			System.out.print(current.data+"-->");
			current = current.next;
		}
		System.out.print("null");
		System.out.println();
	}
	
	int count = 0;
	public void lengthOfList(listNode head) {
		listNode current = head;
		while(current != null) {
			count = count + 1;
			current = current.next;
		}
		System.out.println("Length of Linked list is: "+count);
		middleOfList(head);
	}
	
	public void middleOfList(listNode head) {
		int n = count/2 +1;
		System.out.println(n);
		listNode current = head;
		for(int i=1; i<=n; i++) {
			if(i == n) {
				System.out.println("Middle of LinkedList is: "+current.data);
			}
			current = current.next;
		}
	}

	public static void main(String[] args) {
		
		Q2_Method1_Day5 ob = new Q2_Method1_Day5();
		ob.insertNodeAtBeginning(8);
		ob.insertNodeAtBeginning(7);
		ob.insertNodeAtBeginning(6);
		ob.insertNodeAtBeginning(5);
		ob.insertNodeAtBeginning(4);
		ob.insertNodeAtBeginning(3);
		ob.insertNodeAtBeginning(2);
		ob.insertNodeAtBeginning(1);
		ob.display(head);
		ob.lengthOfList(head);
		
	}

}
