
public class Q4_Method1_Day5 {
	
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
	
	int count = 0;
	public void removeNthNodeFromEnd(listNode head, int x) {
		listNode current = head;
		while(current != null) {
			count = count + 1;
			current = current.next;
		}
		int n = count - x;
		listNode node = head;
		for(int i=1; i<=n; i++) {
			node = node.next;
			if(i == n-1) {
				node.next = node.next.next;
			}
		}
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
	
	public static void main(String[] args) {
		Q4_Method1_Day5 ob = new Q4_Method1_Day5();
		
		ob.insert(8);
		ob.insert(7);
		ob.insert(6);
		ob.insert(5);
		ob.insert(4);
		ob.insert(3);
		ob.insert(2);
		ob.insert(1);
		
		ob.display(head);
		
		ob.removeNthNodeFromEnd(head, 4);
		
		ob.display(head);
	}
}
