
public class Q3_Find_Middle_of_SLL {
	
	private static listnode head = null;
	
	private class listnode{
		private int data;
		private listnode next;
		
		public listnode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void addAtEnd(int data) {
		listnode temp = new listnode(data);
		listnode current = head;
		if(head == null)
			head = temp;
		else {
			while(current.next!=null) {
				current = current.next;
			}
		    current.next = temp;
		}
	}
	
	public void middle(listnode head) {

		listnode slow = head;
		listnode fast = head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		//return slow.data;
		System.out.println("Middle element is: "+slow.data);
		int v = 5/2;
		System.out.println(v);
	}

	public static void main(String[] args) {
		Q3_Find_Middle_of_SLL ob = new Q3_Find_Middle_of_SLL();
		ob.addAtEnd(1);
		ob.addAtEnd(2);
		ob.addAtEnd(3);
		ob.addAtEnd(4);
		ob.addAtEnd(5);
		ob.addAtEnd(6);
		ob.middle(head);
	}
}
