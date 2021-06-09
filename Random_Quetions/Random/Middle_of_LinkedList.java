
public class Middle_of_LinkedList {
	
	static private listNode head = null;
	
	private class listNode{
		private int data;
		private listNode next;
		
		public listNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void createList(int data) {
		listNode temp = new listNode(data);
		listNode current = head;
		if(head == null) {
			head = temp;
		} else {
			while(current.next != null) {
				current = current.next;
			}
			current.next = temp;
		}
	}
	
	public int middleElement(listNode head) {
		listNode slow = head;
		listNode fast = head;
		
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}
	
	public void display(listNode head) {
		listNode current = head;
		while(current != null) {
			System.out.print(current.data+"->");
			current = current.next;
		}
		System.out.println(current);
	}

	public static void main(String[] args) {
		Middle_of_LinkedList ob = new Middle_of_LinkedList();
		ob.createList(5);
		ob.createList(10);
		ob.createList(15);
		ob.createList(20);
		ob.createList(25);
		ob.display(head);
		System.out.println("Middle element is: "+ob.middleElement(head));
	}
}
