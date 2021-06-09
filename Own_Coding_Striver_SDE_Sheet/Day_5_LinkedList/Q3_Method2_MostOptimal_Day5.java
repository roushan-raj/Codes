
public class Q3_Method2_MostOptimal_Day5 {
	
	private static listNode1 head1;
	private static listNode2 head2;
	private static listNode head;
	
	private class listNode1{
		private int data;
		private listNode1 next;
		
		public listNode1(int x) {
			this.data = x;
			this.next = null;
		}
	}
	
	private class listNode2{
		private int data;
		private listNode2 next;
		
		public listNode2(int x) {
			this.data = x;
			this.next = null;
		}
	}
	
	private class listNode{
		private int data;
		private listNode next;
		
		public listNode(int x) {
			this.data = x;
			this.next = null;
		}
	}
	
	public void insert1(int data) {
		listNode1 newNode1 = new listNode1(data);
		newNode1.next = head1;
		head1 = newNode1;
	}
	
	public void insert2(int data) {
		listNode2 newNode2 = new listNode2(data);
		newNode2.next = head2;
		head2 = newNode2;
	}
	
	public void display1(listNode1 head1) {
		listNode1 current = head1;
		while(current != null) {
			System.out.print(current.data + "-->");
			current = current.next;
		}
		System.out.print("null");
		System.out.println();
	}
	
	public void display2(listNode2 head2) {
		listNode2 current = head2;
		while(current != null) {
			System.out.print(current.data + "-->");
			current = current.next;
		}
		System.out.print("null");
		System.out.println();
	}
	
	
	public listNode mergeTwoList(listNode head1, listNode head2) {
		if(head1.data > head2.data) {
			listNode temp = head1;
			head1 = head2;
			head2 = temp;
		}
		listNode res = head1;
		while(head1 != null && head2 != null) {
			listNode temp = null;
			while(head1 != null && head1.data <= head2.data) {
				temp = head1;
				head1 = head1.next;
			}
			temp.next = head2;
			
			listNode tmp = head1;
			head1 = head2;
			head2 = tmp;
		}
		return res;
	}
	
	public void displayMerged(listNode head) {
		listNode current = head;
		while(current != null) {
			System.out.print(current.data + "-->");
			current = current.next;
		}
		System.out.print("null");
		System.out.println();
	}

	public static void main(String[] args) {
		 
		Q3_Method2_MostOptimal_Day5 ob = new Q3_Method2_MostOptimal_Day5();
		
		ob.insert1(9);
		ob.insert1(7);
		ob.insert1(5);
		
		ob.insert2(10);
		ob.insert2(8);
		ob.insert2(4);
		ob.insert2(3);
		
		ob.display1(head1); // display 1st linked list
		ob.display2(head2); // display 2nd linked list
		
		listNode newHead = ob.mergeTwoList(head1, head2);
		
		ob.displayMerged(newHead);
	}
}
