
public class Q4_LinkedList_Slot_2_22Dec2020 {
	
	private Node head=null;
	
	private class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void insertNode(int val) {
	    Node node1 = new Node(val);
		Node list_head1 = head;
		if(head == null) {
			head = node1;
		} else {
			while(list_head1.next != null) {
				list_head1 = list_head1.next;
			}
			list_head1.next = node1;
		}
	}
	
	public void display(Node head) {
		Node curr = head;
		while(curr != null) {
			System.out.print(curr.data+"->");
			curr = curr.next;
		}
	}
	
	public Node manipulation(Node head) {
		int prev = head.data;
		Node temp = head.next;
		
		while(temp != null) {
			if(temp.data < prev) {
				int val = (prev + temp.next.data) / 2;
				temp.data = val;
			}
			else {
				prev = temp.data;
			}
			temp = temp.next;
		}
		return head;
	}

	public static void main(String[] args) {
		Q4_LinkedList_Slot_2_22Dec2020 ob = new Q4_LinkedList_Slot_2_22Dec2020();
		ob.insertNode(10);
		ob.insertNode(8);
		ob.insertNode(14);
		ob.insertNode(16);
		
		ob.display(ob.head);
		
		ob.manipulation(ob.head);
		
		ob.display(ob.head);
	}
}
