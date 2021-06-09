public class Q1_Method2_MostOptimal_Day5 {
	
	private static linkedList head = null;
	
	private class linkedList{
		private int data;
		private linkedList next;
		
		public linkedList(int data) {
			this.data = data;
			this.next =null;
		}
	}
	
	// inserting nodes at the end of linked list
	public void insertNodeAtEnd(int data) {
		linkedList temp = new linkedList(data);
		linkedList list_head = head;
		if(head == null) {
			head = temp;
			//return;
		} else {
			while(list_head.next != null) {
				list_head = list_head.next;
			}
			list_head.next = temp;
			//return;
		}
	}
	
	// displaying linked list at the screen
	public void display(linkedList head) {
		linkedList current = head;
		while(current != null) {
			System.out.print(current.data+"-->");
			current = current.next;
		}
		System.out.println("null");
	}
	
	// reversing the linked list
	public linkedList reverseList(linkedList head) {
		linkedList newHead = null;
		while(head != null) {
			linkedList next = head.next;
			head.next = newHead;
			newHead = head;
			head = next;
		}
		return newHead;
	}

	public static void main(String[] args) {
		Q1_Method2_MostOptimal_Day5 ob = new Q1_Method2_MostOptimal_Day5();
		ob.insertNodeAtEnd(1);
		ob.insertNodeAtEnd(2);
		ob.insertNodeAtEnd(3);
		ob.insertNodeAtEnd(4);
		ob.insertNodeAtEnd(5);
		
		ob.display(head);
		
		linkedList newListHead = ob.reverseList(head);
		
		ob.display(newListHead);
	}
}
