
public class Q5_Method1_MostOptimal_Day5 {
	
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
	
	public void removeGivenElement(listNode head, int x) {
		listNode current = head;
		while(current.data != x) {
			current = current.next;
		}
		current.data = current.next.data;
		current.next = current.next.next;
		
	}

	public static void main(String[] args) {
		
		Q5_Method1_MostOptimal_Day5 ob = new Q5_Method1_MostOptimal_Day5();
		
		ob.insert(8);
		ob.insert(7);
		ob.insert(6);
		ob.insert(5);
		ob.insert(4);
		ob.insert(3);
		ob.insert(2);
		ob.insert(1);
		
		ob.display(head);
		
		ob.removeGivenElement(head, 5);
		
		ob.display(head);

	}
}
