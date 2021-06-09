
public class Add_Num_as_LinkedList {
	
	private static listNode1 head1;
	private static listNode2 head2;
	private static sumList head;
	
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
	
	private class sumList{
		private int data;
		private sumList next;
		
		public sumList(int x) {
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
	
	public void insertSunInList(int data) {
		sumList newNode = new sumList(data);
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
	
	public void displayMerged(sumList head) {
		sumList current = head;
		while(current != null) {
			System.out.print(current.data + "-->");
			current = current.next;
		}
		System.out.print("null");
		System.out.println();
	}
	
	public void adding(listNode1 head1, listNode2 head2) {
		listNode1 l1 = head1;
		listNode2 l2 = head2;
		int carry = 0;
		
		while(l1 != null || l2 != null || carry == 1) {
			int sum = 0;
			if(l1 != null) {
				sum = sum + l1.data;
				l1 = l1.next;
			}
			if(l2 != null) {
				sum = sum + l2.data;
				l2 = l2.next;
			}
			sum = sum + carry;
			carry = sum/10;
			
			insertSunInList(sum%10);
		}
	}
	
	public sumList reverseSumList(sumList head) {
		sumList newHead = null;
		while(head != null) {
			sumList next = head.next;
			head.next = newHead;
			newHead = head;
			head = next;
		}
		return newHead;
	}

	public static void main(String[] args) {
		 
		Add_Num_as_LinkedList ob = new Add_Num_as_LinkedList();
		ob.insert1(3);
		ob.insert1(4);
		ob.insert1(2);
		
		ob.insert2(9);
		ob.insert2(7);
		ob.insert2(6);
		ob.insert2(5);
		
		System.out.print("1st Linked list is: ");
		ob.display1(head1);
		System.out.print("2st Linked list is: ");
		ob.display2(head2);
		
		ob.adding(head1, head2);
		
		sumList newHead = ob.reverseSumList(head);
		
		System.out.println("Linked list after addition: ");
		ob.displayMerged(newHead);
	}
}





