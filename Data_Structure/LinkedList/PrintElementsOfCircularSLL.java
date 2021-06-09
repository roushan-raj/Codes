
public class PrintElementsOfCircularSLL {
	
	private ListNode last;
	private int length;
	
	private class ListNode {
		private int data;
		private ListNode next;
		
		public ListNode (int data) {
			this.data = data;
		}
		
		public void PrintElementsOfCircularSLL() {
			last = null;
			length = 0;
		}
	}
	
	public int lenght () {
		return length;
	}
	
	public boolean isEmpty() {
		return length == 0;
	}
	
	// Create Circular singly linked list
	public void createCircularSLL () {
		
		ListNode first = new ListNode (10);
		ListNode second = new ListNode (20);
		ListNode third = new ListNode (30);
		ListNode fourth = new ListNode (40);
		
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = first;
		
		last = fourth;
	}
	
	// Prints all elements of circular singly linked list 
	public void displayCLL () {
		if (last == null) {
			return;
		}
		
		ListNode first = last.next;
		while (first != last) {
			System.out.print(first.data + " --> ");
			first = first.next;
		}
		System.out.print(first.data);
	}

	public static void main(String[] args) {
		 
		PrintElementsOfCircularSLL CLL = new PrintElementsOfCircularSLL ();
		CLL.createCircularSLL();
		CLL.displayCLL();

	}

}
