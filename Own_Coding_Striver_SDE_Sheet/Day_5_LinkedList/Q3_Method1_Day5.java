
public class Q3_Method1_Day5 {
	
	private static listNode1 head1;
	private static listNode2 head2;
	private static mergedList head;
	
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
	
	private class mergedList{
		private int data;
		private mergedList next;
		
		public mergedList(int x) {
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
	
	public void insertInMergedList(int data) {
		mergedList newNode = new mergedList(data);
		newNode.next = head;
		head = newNode;
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
	
	public void displayMerged(mergedList head) {
		mergedList current = head;
		while(current != null) {
			System.out.print(current.data + "-->");
			current = current.next;
		}
		System.out.print("null");
		System.out.println();
	}
	
	public mergedList mergeSortedList(listNode1 head1, listNode2 head2) {
		listNode1 H1 = head1;
		listNode2 H2 = head2;
		while(H1 != null && H2 != null) {
			if(H1.data < H2.data) {
				insertInMergedList(H1.data);
				H1 = H1.next;
			} else {
				insertInMergedList(H2.data);
				H2 = H2.next;
			}
		}
		while(H1 != null) {
			insertInMergedList(H1.data);
			H1 = H1.next;
		}
		while(H2 != null) {
			insertInMergedList(H2.data);
			H2 = H2.next;
		}
		return head;
	}
	
	public mergedList reverseMergedList(mergedList head) {
		mergedList newHead = null;
		while(head != null) {
			mergedList next = head.next;
			head.next = newHead;
			newHead = head;
			head = next;
		}
		return newHead;
	}

	public static void main(String[] args) {
		 
		Q3_Method1_Day5 ob = new Q3_Method1_Day5();
		
		ob.insert1(9);
		ob.insert1(7);
		ob.insert1(5);
		
		ob.insert2(10);
		ob.insert2(8);
		ob.insert2(4);
		ob.insert2(3);
		
		ob.display1(head1); // display 1st linked list
		ob.display2(head2); // display 2nd linked list
		
		ob.mergeSortedList(head1, head2); // merge both list
		
		ob.displayMerged(head); // display merged list in reverse order
		
		// display merged list in correct order
		mergedList mergeHead = ob.reverseMergedList(head); 
		
		ob.displayMerged(mergeHead);
	}
}
