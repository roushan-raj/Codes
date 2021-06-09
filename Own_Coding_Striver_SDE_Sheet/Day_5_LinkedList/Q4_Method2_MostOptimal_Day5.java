
public class Q4_Method2_MostOptimal_Day5 {
	
private static listNode head;
	
	private class listNode{
		private int data;
		private listNode next;
		
		public listNode(int x) {
			this.data = x;
			this.next = null;
		}
	}
	public void insert(int data) {
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
	
	public listNode removeNthNodeFromEnd(listNode head, int x) {
		//listNode dummy = head;
		listNode slow = head;
		listNode fast = head;
	    
		for(int i=1; i<=x; i++) {
			fast = fast.next;
		}
		while(fast.next != null) {
			slow = slow.next;
			fast = fast.next;
		}
		slow.next = slow.next.next;
		return head;
	}

	public static void main(String[] args) {
		
		Q4_Method2_MostOptimal_Day5 ob = new Q4_Method2_MostOptimal_Day5();
		
		ob.insert(8);
		ob.insert(7);
		ob.insert(6);
		ob.insert(5);
		ob.insert(4);
		ob.insert(3);
		ob.insert(2);
		ob.insert(1);
		
		ob.display(head);
		
		listNode newHead = ob.removeNthNodeFromEnd(head, 5);
		
		ob.display(newHead);
	}
}
