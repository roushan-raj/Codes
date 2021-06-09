
public class Reversal_of_Nodes_in_K_size {
	
	private static listNode head = null;
	
	private class listNode{
		private int data;
		private listNode next;
		
		public listNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void insertNodeAtEnd(int data) {
		listNode newNode = new listNode(data);
		listNode temp = head;
		if(head == null) {
			head = newNode;
		} else {
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;  
		}
	}
	
	public void display(listNode head) {
		listNode current = head;
		while(current != null) {
			System.out.print(current.data+"-->");
			current = current.next;
		}
		System.out.println("null");
	}
	
	public listNode reverse_K_Group(listNode head, int k) {
		if (head == null || k == 0)
		    return head;
		
		listNode dummy = new listNode(0);
		dummy.next = head;
		listNode pre = dummy, cur = dummy, nex = dummy;
		
		listNode current = head;
		int count = 0;
		while(current != null) {
			count = count + 1;
			current = current.next;
		}
		
		while(count >= k) {
			cur = pre.next;
			nex = cur.next;
			
			for(int i=1; i<k; i++) {
				cur.next = nex.next;
				nex.next = pre.next;
				pre.next = nex;
				nex = cur.next;
			}
			pre = cur;
			count = count - k;
		}
		return dummy.next;
	}

	public static void main(String[] args) {
		
		Reversal_of_Nodes_in_K_size ob = new Reversal_of_Nodes_in_K_size();
		
		ob.insertNodeAtEnd(1);
		ob.insertNodeAtEnd(2);
		ob.insertNodeAtEnd(3);
		ob.insertNodeAtEnd(4);
		ob.insertNodeAtEnd(5);
		ob.insertNodeAtEnd(6);
		ob.insertNodeAtEnd(7);
		ob.insertNodeAtEnd(8);
		
		System.out.println("Original Linked list: ");
		ob.display(head);
		
		System.out.println();
		listNode newReverseHead = ob.reverse_K_Group(head, 3);
		
		System.out.println("Linked list after reversal of nodes in size-K:");
		ob.display(newReverseHead);
	}
}
